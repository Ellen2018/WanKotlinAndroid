package com.yalemang.wankotlinandroid.ui.splash

import android.content.Intent
import android.widget.Toast
import com.yalemang.wankotlinandroid.R
import com.yalemang.wankotlinandroid.base.BaseActivity
import com.yalemang.wankotlinandroid.ui.main.MainActivity
import kotlinx.android.synthetic.main.activity_spalsh.*

/**
 * Splash界面
 */
class SplashActivity: BaseActivity() {

    override fun initView() {
        //这里控件不用直接findViewById
        //是通过kotlin-android-extensions插件完成的
        tv_jump.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    override fun initData() {

    }

    override fun setLayoutId(): Int {
        return R.layout.activity_spalsh
    }

}