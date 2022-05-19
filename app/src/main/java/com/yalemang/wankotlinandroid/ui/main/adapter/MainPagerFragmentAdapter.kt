package com.yalemang.wankotlinandroid.ui.main.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.yalemang.wankotlinandroid.ui.main.fragment.gc.GcFragment
import com.yalemang.wankotlinandroid.ui.main.fragment.gzh.GzhFragment
import com.yalemang.wankotlinandroid.ui.main.fragment.main.MainFragment
import com.yalemang.wankotlinandroid.ui.main.fragment.project.ProjectFragment
import com.yalemang.wankotlinandroid.ui.main.fragment.system.SystemFragment

class MainPagerFragmentAdapter(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int {
        return 5
    }

    override fun createFragment(position: Int): Fragment {
        val fragment =
            when (position) {
                0 -> {
                    MainFragment()
                }
                1 -> {
                    GcFragment()
                }
                2 -> {
                    GzhFragment()
                }
                3 -> {
                    SystemFragment()
                }
                else -> {
                    ProjectFragment()
                }
            }
        return fragment
    }
}