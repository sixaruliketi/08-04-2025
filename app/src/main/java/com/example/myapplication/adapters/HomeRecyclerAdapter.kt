package com.example.myapplication.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.R
import com.example.myapplication.databinding.HomeItemBinding
import com.example.myapplication.models.Book

class HomeRecyclerAdapter(val listItem : List<Book>)
    : RecyclerView.Adapter<HomeRecyclerAdapter.Holder>() {

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val binding = HomeItemBinding.bind(itemView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.home_item, parent,false)
        return Holder(view)
    }

    override fun getItemCount() = listItem.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.binding.apply {
            val item = listItem[position]
            bookName.text = item.name
            bookDetails.text = item.details

            //glide
            Glide.with(root).load(item.cover).into(bookCover)

        }
    }

}