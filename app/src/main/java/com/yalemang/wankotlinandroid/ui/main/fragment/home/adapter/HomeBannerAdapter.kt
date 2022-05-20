package com.yalemang.wankotlinandroid.ui.main.fragment.home.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.yalemang.wankotlinandroid.R
import com.yalemang.wankotlinandroid.bean.BannerData
import com.yalemang.wankotlinandroid.bean.DataBanner
import com.youth.banner.adapter.BannerAdapter

class HomeBannerAdapter(dataList: List<DataBanner>?) :
    BannerAdapter<DataBanner, BannerViewHolder>(dataList) {

    override fun onCreateHolder(parent: ViewGroup?, viewType: Int): BannerViewHolder {
        val view =
            LayoutInflater.from(parent?.context).inflate(R.layout.item_layout_home_banner, parent,false)
        return BannerViewHolder(view)
    }

    override fun onBindView(
        holder: BannerViewHolder?,
        data: DataBanner?,
        position: Int,
        size: Int
    ) {
        //加载Banner图片
        holder?.itemView?.context?.let { Glide.with(it).load(data?.imagePath).into(holder.iv) }
    }

}

class BannerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val iv: ImageView = itemView.findViewById(R.id.iv_banner)

}