package com.example.myapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.R
import com.example.myapplication.adapters.HomeRecyclerAdapter
import com.example.myapplication.databinding.FragmentHomeBinding
import com.example.myapplication.models.Book

class HomeFragment : Fragment() {

    lateinit var binding : FragmentHomeBinding
    lateinit var homeRVAdapter : HomeRecyclerAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) = with(binding) {
        super.onViewCreated(view, savedInstanceState)
        homeRVAdapter = HomeRecyclerAdapter(getItem())
        homeRV.adapter = homeRVAdapter
        homeRV.layoutManager = LinearLayoutManager(requireContext())
    }

    private fun getItem(): List<Book> {
        val list = mutableListOf(
            Book("1984","year: 1949\nauthor: George Orwell","https://m.media-amazon.com/images/I/61HkdyBpKOL.jpg"),
            Book("harry potter","year: 2004\nauthor: J.K. Rowling","https://m.media-amazon.com/images/I/71Q1Iu4suSL._AC_UF894,1000_QL80_.jpg"),
            Book("atomic habits","year: 2023,author: James Clear","https://wizdomapp.com/wp-content/uploads/2024/02/Atomic-Habits-1.png"),
            Book("1984","year: 1949\nauthor: George Orwell","https://m.media-amazon.com/images/I/61HkdyBpKOL.jpg"),
            Book("harry potter","year: 2004\nauthor: J.K. Rowling","https://m.media-amazon.com/images/I/71Q1Iu4suSL._AC_UF894,1000_QL80_.jpg"),
            Book("atomic habits","year: 2023,author: James Clear","https://wizdomapp.com/wp-content/uploads/2024/02/Atomic-Habits-1.png"),
            Book("1984","year: 1949\nauthor: George Orwell","https://m.media-amazon.com/images/I/61HkdyBpKOL.jpg"),
            Book("harry potter","year: 2004\nauthor: J.K. Rowling","https://m.media-amazon.com/images/I/71Q1Iu4suSL._AC_UF894,1000_QL80_.jpg"),
            Book("atomic habits","year: 2023,author: James Clear","https://wizdomapp.com/wp-content/uploads/2024/02/Atomic-Habits-1.png"),
            Book("1984","year: 1949\nauthor: George Orwell","https://m.media-amazon.com/images/I/61HkdyBpKOL.jpg"),
            Book("harry potter","year: 2004\nauthor: J.K. Rowling","https://m.media-amazon.com/images/I/71Q1Iu4suSL._AC_UF894,1000_QL80_.jpg"),
            Book("atomic habits","year: 2023,author: James Clear","https://wizdomapp.com/wp-content/uploads/2024/02/Atomic-Habits-1.png"),
            Book("1984","year: 1949\nauthor: George Orwell","https://m.media-amazon.com/images/I/61HkdyBpKOL.jpg"),
            Book("harry potter","year: 2004\nauthor: J.K. Rowling","https://m.media-amazon.com/images/I/71Q1Iu4suSL._AC_UF894,1000_QL80_.jpg"),
            Book("atomic habits","year: 2023,author: James Clear","https://wizdomapp.com/wp-content/uploads/2024/02/Atomic-Habits-1.png"),
            Book("1984","year: 1949\nauthor: George Orwell","https://m.media-amazon.com/images/I/61HkdyBpKOL.jpg"),
            Book("harry potter","year: 2004\nauthor: J.K. Rowling","https://m.media-amazon.com/images/I/71Q1Iu4suSL._AC_UF894,1000_QL80_.jpg"),
            Book("atomic habits","year: 2023,author: James Clear","https://wizdomapp.com/wp-content/uploads/2024/02/Atomic-Habits-1.png"),
            Book("1984","year: 1949\nauthor: George Orwell","https://m.media-amazon.com/images/I/61HkdyBpKOL.jpg"),
            Book("harry potter","year: 2004\nauthor: J.K. Rowling","https://m.media-amazon.com/images/I/71Q1Iu4suSL._AC_UF894,1000_QL80_.jpg"),
            Book("atomic habits","year: 2023,author: James Clear","https://wizdomapp.com/wp-content/uploads/2024/02/Atomic-Habits-1.png"),
            Book("1984","year: 1949\nauthor: George Orwell","https://m.media-amazon.com/images/I/61HkdyBpKOL.jpg"),
            Book("harry potter","year: 2004\nauthor: J.K. Rowling","https://m.media-amazon.com/images/I/71Q1Iu4suSL._AC_UF894,1000_QL80_.jpg"),
            Book("atomic habits","year: 2023,author: James Clear","https://wizdomapp.com/wp-content/uploads/2024/02/Atomic-Habits-1.png"),
            Book("1984","year: 1949\nauthor: George Orwell","https://m.media-amazon.com/images/I/61HkdyBpKOL.jpg"),
            Book("harry potter","year: 2004\nauthor: J.K. Rowling","https://m.media-amazon.com/images/I/71Q1Iu4suSL._AC_UF894,1000_QL80_.jpg"),
            Book("atomic habits","year: 2023,author: James Clear","https://wizdomapp.com/wp-content/uploads/2024/02/Atomic-Habits-1.png"),
            Book("1984","year: 1949\nauthor: George Orwell","https://m.media-amazon.com/images/I/61HkdyBpKOL.jpg"),
            Book("harry potter","year: 2004\nauthor: J.K. Rowling","https://m.media-amazon.com/images/I/71Q1Iu4suSL._AC_UF894,1000_QL80_.jpg"),
            Book("atomic habits","year: 2023,author: James Clear","https://wizdomapp.com/wp-content/uploads/2024/02/Atomic-Habits-1.png"),
            Book("1984","year: 1949\nauthor: George Orwell","https://m.media-amazon.com/images/I/61HkdyBpKOL.jpg"),
            Book("harry potter","year: 2004\nauthor: J.K. Rowling","https://m.media-amazon.com/images/I/71Q1Iu4suSL._AC_UF894,1000_QL80_.jpg"),
            Book("atomic habits","year: 2023,author: James Clear","https://wizdomapp.com/wp-content/uploads/2024/02/Atomic-Habits-1.png"),
            Book("1984","year: 1949\nauthor: George Orwell","https://m.media-amazon.com/images/I/61HkdyBpKOL.jpg"),
            Book("harry potter","year: 2004\nauthor: J.K. Rowling","https://m.media-amazon.com/images/I/71Q1Iu4suSL._AC_UF894,1000_QL80_.jpg"),
            Book("atomic habits","year: 2023,author: James Clear","https://wizdomapp.com/wp-content/uploads/2024/02/Atomic-Habits-1.png"),
            Book("1984","year: 1949\nauthor: George Orwell","https://m.media-amazon.com/images/I/61HkdyBpKOL.jpg"),
            Book("harry potter","year: 2004\nauthor: J.K. Rowling","https://m.media-amazon.com/images/I/71Q1Iu4suSL._AC_UF894,1000_QL80_.jpg"),
            Book("atomic habits","year: 2023,author: James Clear","https://wizdomapp.com/wp-content/uploads/2024/02/Atomic-Habits-1.png")
        )
        return list
    }

    companion object {
        @JvmStatic
        fun newInstance() = HomeFragment()
    }
}