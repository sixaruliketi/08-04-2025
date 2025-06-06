package com.example.myapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.R
import com.example.myapplication.adapters.ProfileRecyclerViewAdapter
import com.example.myapplication.adapters.ViewPagerAdapter
import com.example.myapplication.databinding.FragmentProfileBinding
import com.example.myapplication.models.Book
import com.example.myapplication.profileFragments.FirstFragment
import com.example.myapplication.profileFragments.SecondFragment
import com.google.android.material.tabs.TabLayoutMediator

class ProfileFragment : Fragment() {

    private var _binding : FragmentProfileBinding? = null
    private val binding get() = _binding!!

    lateinit var profileRVAdapter: ProfileRecyclerViewAdapter

    private val fList = listOf(
        FirstFragment(),
        SecondFragment()
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProfileBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initVP()
        initRV()
    }

    private fun initRV() = with(binding){
        profileRVAdapter = ProfileRecyclerViewAdapter()
        profileRV.adapter = profileRVAdapter
        profileRV.layoutManager = LinearLayoutManager(requireContext(),
            LinearLayoutManager.HORIZONTAL, false)

        profileRVAdapter.submitList(
            listOf(
                Book("1984","","https://m.media-amazon.com/images/I/61HkdyBpKOL.jpg"),
                Book("Easy Way", "","https://m.media-amazon.com/images/I/81miyVuJWVL.jpg"),
                Book("Harry Potter","","https://m.media-amazon.com/images/I/71Q1Iu4suSL._AC_UF894,1000_QL80_.jpg"),
                Book("1984","","https://m.media-amazon.com/images/I/61HkdyBpKOL.jpg"),
                Book("Easy Way", "","https://m.media-amazon.com/images/I/81miyVuJWVL.jpg"),
                Book("Harry Potter","","https://m.media-amazon.com/images/I/71Q1Iu4suSL._AC_UF894,1000_QL80_.jpg"),
                Book("1984","","https://m.media-amazon.com/images/I/61HkdyBpKOL.jpg"),
                Book("Easy Way", "","https://m.media-amazon.com/images/I/81miyVuJWVL.jpg"),
                Book("Harry Potter","","https://m.media-amazon.com/images/I/71Q1Iu4suSL._AC_UF894,1000_QL80_.jpg"),
                Book("1984","","https://m.media-amazon.com/images/I/61HkdyBpKOL.jpg"),
                Book("Easy Way", "","https://m.media-amazon.com/images/I/81miyVuJWVL.jpg"),
                Book("Harry Potter","","https://m.media-amazon.com/images/I/71Q1Iu4suSL._AC_UF894,1000_QL80_.jpg"),
                Book("1984","","https://m.media-amazon.com/images/I/61HkdyBpKOL.jpg"),
                Book("Easy Way", "","https://m.media-amazon.com/images/I/81miyVuJWVL.jpg"),
                Book("Harry Potter","","https://m.media-amazon.com/images/I/71Q1Iu4suSL._AC_UF894,1000_QL80_.jpg"),
                Book("1984","","https://m.media-amazon.com/images/I/61HkdyBpKOL.jpg"),
                Book("Easy Way", "","https://m.media-amazon.com/images/I/81miyVuJWVL.jpg"),
                Book("Harry Potter","","https://m.media-amazon.com/images/I/71Q1Iu4suSL._AC_UF894,1000_QL80_.jpg"),
                Book("1984","","https://m.media-amazon.com/images/I/61HkdyBpKOL.jpg"),
                Book("Easy Way", "","https://m.media-amazon.com/images/I/81miyVuJWVL.jpg"),
                Book("Harry Potter","","https://m.media-amazon.com/images/I/71Q1Iu4suSL._AC_UF894,1000_QL80_.jpg"),
                Book("1984","","https://m.media-amazon.com/images/I/61HkdyBpKOL.jpg"),
                Book("Easy Way", "","https://m.media-amazon.com/images/I/81miyVuJWVL.jpg"),
                Book("Harry Potter","","https://m.media-amazon.com/images/I/71Q1Iu4suSL._AC_UF894,1000_QL80_.jpg"),
                Book("1984","","https://m.media-amazon.com/images/I/61HkdyBpKOL.jpg"),
                Book("Easy Way", "","https://m.media-amazon.com/images/I/81miyVuJWVL.jpg"),
                Book("Harry Potter","","https://m.media-amazon.com/images/I/71Q1Iu4suSL._AC_UF894,1000_QL80_.jpg"),
                Book("1984","","https://m.media-amazon.com/images/I/61HkdyBpKOL.jpg"),
                Book("Easy Way", "","https://m.media-amazon.com/images/I/81miyVuJWVL.jpg"),
                Book("Harry Potter","","https://m.media-amazon.com/images/I/71Q1Iu4suSL._AC_UF894,1000_QL80_.jpg"),
                Book("1984","","https://m.media-amazon.com/images/I/61HkdyBpKOL.jpg"),
                Book("Easy Way", "","https://m.media-amazon.com/images/I/81miyVuJWVL.jpg"),
                Book("Harry Potter","","https://m.media-amazon.com/images/I/71Q1Iu4suSL._AC_UF894,1000_QL80_.jpg"),
                Book("1984","","https://m.media-amazon.com/images/I/61HkdyBpKOL.jpg"),
                Book("Easy Way", "","https://m.media-amazon.com/images/I/81miyVuJWVL.jpg"),
                Book("Harry Potter","","https://m.media-amazon.com/images/I/71Q1Iu4suSL._AC_UF894,1000_QL80_.jpg"),
                Book("1984","","https://m.media-amazon.com/images/I/61HkdyBpKOL.jpg"),
                Book("Easy Way", "","https://m.media-amazon.com/images/I/81miyVuJWVL.jpg"),
                Book("Harry Potter","","https://m.media-amazon.com/images/I/71Q1Iu4suSL._AC_UF894,1000_QL80_.jpg"),
                Book("1984","","https://m.media-amazon.com/images/I/61HkdyBpKOL.jpg"),
                Book("Easy Way", "","https://m.media-amazon.com/images/I/81miyVuJWVL.jpg"),
                Book("Harry Potter","","https://m.media-amazon.com/images/I/71Q1Iu4suSL._AC_UF894,1000_QL80_.jpg")

            )
        )

    }


    private fun initVP() = with(binding){
        val viewPagerAdapter = ViewPagerAdapter(requireActivity(), fList)
        vp.adapter = viewPagerAdapter

        val tList = listOf(
            ContextCompat.getDrawable(requireContext(),R.drawable.baseline_privacy_tip_24),
            ContextCompat.getDrawable(requireContext(),R.drawable.baseline_public_24)
        )

        TabLayoutMediator(tabLayout,vp) { tab, position ->
            tab.icon = tList[position]
        }.attach()
    }

    companion object {
        @JvmStatic
        fun newInstance() = ProfileFragment()
    }
}