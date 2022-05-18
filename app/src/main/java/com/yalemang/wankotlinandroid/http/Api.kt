package com.yalemang.wankotlinandroid.http

import com.yalemang.wankotlinandroid.bean.MainData
import retrofit2.Response
import retrofit2.http.GET

interface Api {

    @GET("/article/list/0/json")
    suspend fun getBannerData():MainData

}