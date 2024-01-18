package com.example.binusapp.core

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.binusapp.R
import io.github.inflationx.viewpump.ViewPumpContextWrapper
import java.util.*


abstract class BaseActivity : AppCompatActivity() {

    override fun attachBaseContext(newBase: Context) {
        super.attachBaseContext(ViewPumpContextWrapper.wrap(newBase))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        changeStatusBarWhite()
    }

    override fun finish() {
        super.finish()
        overridePendingTransitionExit()
    }

    override fun startActivity(intent: Intent?) {
        super.startActivity(intent)
        overridePendingTransitionEnter()
    }

    /**
     * Overrides the pending Activity transition by performing the "Enter" animation.
     */
    @Suppress("DEPRECATION")
    open fun overridePendingTransitionEnter() {
        overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left)
    }

    /**
     * Overrides the pending Activity transition by performing the "Exit" animation.
     */
    @Suppress("DEPRECATION")
    protected open fun overridePendingTransitionExit() {
        overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right)
    }

    @SuppressLint("ObsoleteSdkInt")
    open fun changeStatusBarWhite() {
        window.statusBarColor = ContextCompat.getColor(this, R.color.colorPrimary)
    }

}