package com.example.myapplication.service

import com.example.myapplication.models.Post
import com.example.myapplication.models.PostItem
import retrofit2.Call
import retrofit2.http.GET

interface JSONConverterAPI {

    // Define a GET request to the "posts" endpoint
    // It returns a Call object wrapping a list of PostListItem objects
    @GET("posts")
    fun getPosts(): Call<List<PostItem>>
}