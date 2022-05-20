package com.yalemang.wankotlinandroid.ui.main

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.yalemang.wankotlinandroid.bean.BannerData
import com.yalemang.wankotlinandroid.bean.MainData
import com.yalemang.wankotlinandroid.http.RetrofitManager
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainViewModel:ViewModel() {

    val bannerData:MutableLiveData<BannerData> by lazy {
        MutableLiveData<BannerData>().also {
             loadMainData()
        }
    }

    private fun loadMainData(){
        GlobalScope.launch {
            //获取首页数据
            Log.d("Ellen2020","当前线程:${Thread.currentThread().name}")
            val data = RetrofitManager.getInstance().getApi().getBannerData()
            bannerData.postValue(data)
        }
    }
}