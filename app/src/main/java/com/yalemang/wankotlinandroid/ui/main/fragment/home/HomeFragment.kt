package com.yalemang.wankotlinandroid.ui.main.fragment.home

import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.yalemang.wankotlinandroid.R
import com.yalemang.wankotlinandroid.base.BaseFragment
import com.yalemang.wankotlinandroid.ui.main.MainActivity
import com.yalemang.wankotlinandroid.ui.main.MainViewModel
import com.yalemang.wankotlinandroid.ui.main.fragment.home.adapter.HomeBannerAdapter
import kotlinx.android.synthetic.main.fragment_main.*

/**
 * 主页Fragment
 */
class HomeFragment : BaseFragment() {

    private var mainViewMode: MainViewModel? = null

    override fun initView() {

    }

    override fun initData() {
        mainViewMode = activity?.let {
            ViewModelProvider(
                it.viewModelStore,
                ViewModelProvider.NewInstanceFactory()
            ).get(MainViewModel::class.java)
        }
        mainViewMode?.bannerData?.observe(this, {
            Log.d("Ellen2020", "Banner数据:" + it.errorMsg)
            banner.setAdapter(HomeBannerAdapter(it.data))
        })
    }

    override fun setLayoutId(): Int {
        return R.layout.fragment_main
    }
}