package com.example.myapplication.profileFragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.helper.widget.Grid
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.myapplication.R
import com.example.myapplication.adapters.ProfileRecyclerViewAdapter
import com.example.myapplication.databinding.FragmentFirstBinding
import com.example.myapplication.models.Book

class FirstFragment : Fragment(){

    lateinit var binding : FragmentFirstBinding
    lateinit var gridRV: ProfileRecyclerViewAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(layoutInflater,container,false)
        init()
        return binding.root
    }

    private fun init() = with(binding){
        gridRV = ProfileRecyclerViewAdapter()
        firstGridRV.adapter = gridRV
        firstGridRV.layoutManager = GridLayoutManager(requireContext(),4)
        gridRV.submitList(listOf(

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
        ))
    }


}