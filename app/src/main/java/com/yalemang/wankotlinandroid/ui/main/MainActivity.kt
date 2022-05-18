package com.yalemang.wankotlinandroid.ui.main

import android.util.Log
import com.google.gson.Gson
import com.yalemang.wankotlinandroid.R
import com.yalemang.wankotlinandroid.base.BaseActivity
import com.yalemang.wankotlinandroid.http.RetrofitManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

/**
 * 主界面
 */
class MainActivity:BaseActivity() {
    override fun initView() {

    }

    override fun initData() {
        GlobalScope.launch(Dispatchers.Main) {
            //获取首页数据
            val data = RetrofitManager.getInstance().getApi().getBannerData()
            Log.d("Ellen2018", "json数据:${Gson().toJson(data)}")
            tv_content.text = Gson().toJson(data)
        }

    }

    override fun setLayoutId(): Int {
       return R.layout.activity_main
    }
}