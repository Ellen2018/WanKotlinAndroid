package com.yalemang.wankotlinandroid.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

abstract class BaseFragment:Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(setLayoutId(),container,false)
        initView()
        initData()
        return view
    }

    protected abstract fun initView()
    protected abstract fun initData()
    protected abstract fun setLayoutId():Int

}