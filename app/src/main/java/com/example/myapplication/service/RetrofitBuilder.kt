package com.example.myapplication.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBuilder {

    // Base URL of the API endpoint
    private const val BASE_URL = "https://jsonplaceholder.typicode.com/"

    // Lazily initialize the Retrofit instance only when it's first accessed
    private val retrofit by lazy {
        Retrofit.Builder()
            // Set the base URL for all API requests
            .baseUrl(BASE_URL)
            // Add a converter to automatically convert JSON to Kotlin data classes (using Gson)
            .addConverterFactory(GsonConverterFactory.create())
            // Build the Retrofit instance
            .build()
    }


    // Lazily create an implementation of the API interface using Retrofit
    val api: JSONConverterAPI by lazy {
        // Retrofit will generate the necessary code for the interface methods
        retrofit.create(JSONConverterAPI::class.java)
    }
}
