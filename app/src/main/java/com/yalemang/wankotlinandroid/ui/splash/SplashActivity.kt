package com.yalemang.wankotlinandroid.ui.splash

import android.content.Intent
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import com.yalemang.wankotlinandroid.R
import com.yalemang.wankotlinandroid.base.BaseActivity
import com.yalemang.wankotlinandroid.ui.login.LoginActivity
import com.yalemang.wankotlinandroid.ui.main.MainActivity
import kotlinx.android.synthetic.main.activity_spalsh.*

/**
 * Splash界面
 */
class SplashActivity : BaseActivity(), Runnable {

    private val handler = Handler(Looper.getMainLooper())
    private var time = 5
    @Volatile
    private var isClickJump = false

    override fun initView() {
        //这里控件不用直接findViewById
        //是通过kotlin-android-extensions插件完成的
        tv_jump.setOnClickListener {
            isClickJump = true
            jump()
        }
    }

    override fun initData() {
        tv_jump.text = "跳过$time"
        //开启倒计时
        handler.postDelayed(this, 1000)
    }

    override fun setLayoutId(): Int {
        return R.layout.activity_spalsh
    }

    override fun run() {
        time--
        tv_jump.text = "跳过$time"
        if (time == 0) {
            //防止MainActivity被启动两次
            if(!isClickJump) {
               jump()
            }
        } else {
            if (!isClickJump) {
                handler.postDelayed(this, 1000)
            }
        }
    }

    private fun jump(){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

}