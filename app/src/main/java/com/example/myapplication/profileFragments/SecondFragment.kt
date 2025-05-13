package com.example.myapplication.profileFragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.adapters.PostRecyclerViewAdapter
import com.example.myapplication.databinding.FragmentSecondBinding
import com.example.myapplication.models.Post
import com.example.myapplication.models.PostItem
import com.example.myapplication.service.RetrofitBuilder
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding

    lateinit var postRVAdapter: PostRecyclerViewAdapter

    private var postList = mutableListOf<PostItem>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.postRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        postRVAdapter = PostRecyclerViewAdapter(postList)
        binding.postRecyclerView.adapter = postRVAdapter

        fetchData()
    }

    private fun fetchData() {
        RetrofitBuilder.api.getPosts().enqueue(object : Callback<List<PostItem>> {
            override fun onResponse(call: Call<List<PostItem>>, response: Response<List<PostItem>>) {
                if (response.isSuccessful) {
                    val posts = response.body()
                    if (posts != null) {
                        postList.clear()
                        postList.addAll(posts)
                        postRVAdapter.notifyDataSetChanged()
                    }
                } else {
                    println("Error: ${response.code()}")
                }
            }


            override fun onFailure(call: Call<List<PostItem>>, t: Throwable) {
                println("Failed to fetch posts: ${t.message}")
            }
        })
    }


}