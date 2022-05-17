package com.yalemang.wankotlinandroid.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(setLayoutId())
        initView()
        initData()
    }

    protected abstract fun initView()
    protected abstract fun initData()
    protected abstract fun setLayoutId():Int

}