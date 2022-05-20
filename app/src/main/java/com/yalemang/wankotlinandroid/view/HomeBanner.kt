package com.yalemang.wankotlinandroid.view

import android.content.Context
import android.util.AttributeSet
import com.yalemang.wankotlinandroid.bean.DataBanner
import com.yalemang.wankotlinandroid.ui.main.fragment.home.adapter.BannerViewHolder
import com.yalemang.wankotlinandroid.ui.main.fragment.home.adapter.HomeBannerAdapter
import com.youth.banner.Banner

/**
 * 兼容Java泛型封装一层解决Java泛型与Kotlin不兼容问题
 */
class HomeBanner(context: Context?, attrs: AttributeSet?) :
    Banner<DataBanner, HomeBannerAdapter<DataBanner, BannerViewHolder>>(context, attrs) {

}