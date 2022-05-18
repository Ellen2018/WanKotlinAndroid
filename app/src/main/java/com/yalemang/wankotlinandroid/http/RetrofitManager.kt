package com.yalemang.wankotlinandroid.http

import android.util.Log
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.Executors

class RetrofitManager {

    private var okHttpClient: OkHttpClient
    private var retrofit: Retrofit
    private var api: Api

    private constructor() {
        //日志拦截器
        val logInterceptor = HttpLoggingInterceptor {
            Log.d("OkHttp", it)
        }
        logInterceptor.level = HttpLoggingInterceptor.Level.BODY

        okHttpClient = OkHttpClient.Builder()
            .addInterceptor(logInterceptor)
            .build()

        retrofit = Retrofit.Builder()
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .callbackExecutor(Executors.newSingleThreadExecutor()) //使用单独的线程
            .baseUrl(BASE_URL)
            .build()

        api = retrofit.create(Api::class.java)
    }

    companion object {
        private const val BASE_URL = "https://www.wanandroid.com"
        private var INSTANCE: RetrofitManager? = null

        fun getInstance(): RetrofitManager {
            if (INSTANCE == null) {
                synchronized(RetrofitManager::class.java) {
                    if (INSTANCE == null) {
                        INSTANCE = RetrofitManager()
                    }
                }
            }
            return INSTANCE!!
        }
    }

    fun getApi(): Api {
        return api
    }

}