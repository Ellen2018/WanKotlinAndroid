package com.yalemang.wankotlinandroid.ui.main

import androidx.lifecycle.ViewModelProvider
import com.google.gson.Gson
import com.yalemang.wankotlinandroid.R
import com.yalemang.wankotlinandroid.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

/**
 * 主界面
 */
class MainActivity:BaseActivity() {

    private lateinit var mainViewModel:MainViewModel

    override fun initView() {

    }

    override fun initData() {
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        mainViewModel.mainData.observe(this,{
            tv_content.text = Gson().toJson(it)
        })

    }

    override fun setLayoutId(): Int {
       return R.layout.activity_main
    }
}