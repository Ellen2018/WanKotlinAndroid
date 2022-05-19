package com.yalemang.wankotlinandroid.ui.main

import androidx.viewpager2.widget.ViewPager2
import com.yalemang.wankotlinandroid.R
import com.yalemang.wankotlinandroid.base.BaseActivity
import com.yalemang.wankotlinandroid.ui.main.adapter.MainPagerFragmentAdapter
import kotlinx.android.synthetic.main.activity_main.*

/**
 * 主界面
 */
class MainActivity : BaseActivity() {

    override fun initView() {

    }

    override fun initData() {
        view_pager_2.adapter = MainPagerFragmentAdapter(this)
        view_pager_2.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                var menuItemId = R.id.navigation_home
                when (position) {
                    0 -> {
                        menuItemId = R.id.navigation_home
                    }
                    1 -> {
                        menuItemId = R.id.navigation_gc
                    }
                    2 -> {
                        menuItemId = R.id.navigation_gzh
                    }
                    3 -> {
                        menuItemId = R.id.navigation_system
                    }
                    4 -> {
                        menuItemId = R.id.navigation_project
                    }
                }
                nav_view.selectedItemId = menuItemId
            }
        })
        nav_view.setOnNavigationItemSelectedListener {
            var selectedPosition = 0
            when (it.itemId) {
                R.id.navigation_home -> {
                    selectedPosition = 0
                }
                R.id.navigation_gc -> {
                    selectedPosition = 1
                }
                R.id.navigation_gzh -> {
                    selectedPosition = 2
                }
                R.id.navigation_system -> {
                    selectedPosition = 3
                }
                R.id.navigation_project -> {
                    selectedPosition = 4
                }
            }
            view_pager_2.setCurrentItem(selectedPosition, true)
            true
        }
    }

    override fun setLayoutId(): Int {
        return R.layout.activity_main
    }
}