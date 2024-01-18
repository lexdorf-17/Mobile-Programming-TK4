package com.example.binusapp.ui.launch.view

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.binusapp.BaseApplication
import com.example.binusapp.core.BaseActivity
import com.example.binusapp.databinding.ActivityLaunchBinding
import com.example.binusapp.ui.login.view.LoginActivity
import com.example.binusapp.ui.main.view.MainActivity


@SuppressLint("CustomSplashScreen")
class LaunchActivity : BaseActivity() {

    private lateinit var binding: ActivityLaunchBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLaunchBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Handler(Looper.getMainLooper()).postDelayed({
            checkLogin()
        }, 1500)
    }

    private fun checkLogin() {
        val isLogin = BaseApplication.appPreferences.isLogin()
        if(isLogin) {
            val intent = Intent(this, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
        } else {
            val intent = Intent(this, LoginActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
        }
    }
}