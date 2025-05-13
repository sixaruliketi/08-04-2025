package com.example.myapplication.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.databinding.PostItemBinding
import com.example.myapplication.models.PostItem

class PostRecyclerViewAdapter(private val posts: List<PostItem>) :
    RecyclerView.Adapter<PostRecyclerViewAdapter.PostViewHolder>() {


    class PostViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val binding = PostItemBinding.bind(itemView)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.post_item, parent, false)
        return PostViewHolder(view)
    }


    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        val post = posts[position]
        holder.binding.apply {
            postTitle.text = post.title
            userID.text = post.id.toString()
            postBody.text = post.body
        }
    }


    override fun getItemCount(): Int = posts.size
}
