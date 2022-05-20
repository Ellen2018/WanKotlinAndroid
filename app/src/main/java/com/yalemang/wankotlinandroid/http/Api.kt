package com.yalemang.wankotlinandroid.http

import com.yalemang.wankotlinandroid.bean.BannerData
import com.yalemang.wankotlinandroid.bean.MainData
import retrofit2.Response
import retrofit2.http.GET

interface Api {

    @GET("/banner/json")
    suspend fun getBannerData():BannerData

    @GET("/article/list/0/json")
    suspend fun getTitleData():MainData

}