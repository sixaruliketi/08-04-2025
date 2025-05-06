package com.example.myapplication.adapters

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.R
import com.example.myapplication.databinding.ProfileItemBinding
import com.example.myapplication.models.Book

class ProfileRecyclerViewAdapter
    : ListAdapter<Book,ProfileRecyclerViewAdapter.ProfileViewHolder>(Comparator()) {

    inner class ProfileViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        private val binding = ProfileItemBinding.bind(itemView)
        fun bind(item: Book) = with(binding){
            profileTV.text = item.name

            //photo
            Glide.with(root).load(item.cover).into(profileIV)
        }
    }

    class Comparator(): DiffUtil.ItemCallback<Book>() {
        override fun areItemsTheSame(oldItem: Book, newItem: Book): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: Book, newItem: Book): Boolean {
            return oldItem == newItem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.profile_item,parent,false)
        return ProfileViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProfileViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}