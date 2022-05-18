package com.yalemang.wankotlinandroid.ui.main

import android.util.Log
import com.google.gson.Gson
import com.yalemang.wankotlinandroid.R
import com.yalemang.wankotlinandroid.base.BaseActivity
import com.yalemang.wankotlinandroid.http.RetrofitManager
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

/**
 * 主界面
 */
class MainActivity:BaseActivity() {
    override fun initView() {

    }

    override fun initData() {
        GlobalScope.launch {
            //获取首页数据
            val call = RetrofitManager.getInstance().getApi().getBannerData()
            Log.d("Ellen2018", "json数据:${Gson().toJson(call)}")
        }

    }

    override fun setLayoutId(): Int {
       return R.layout.activity_main
    }
}