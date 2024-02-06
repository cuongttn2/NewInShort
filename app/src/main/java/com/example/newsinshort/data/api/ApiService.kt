package com.example.newsinshort.data.api

import com.example.newsinshort.data.entity.NewsResponse
import com.example.newsinshort.ui.AppConstants
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("v2/top-headlines")
    fun getNewsHeadline(
        @Query("country") country: String,
        @Query("apiKey") apiKey: String = AppConstants.API_KEY
    ): Response<NewsResponse>


}
