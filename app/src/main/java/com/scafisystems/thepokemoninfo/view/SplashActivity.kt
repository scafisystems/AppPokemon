/*
 * Copyright (c) 7/1/2020. Created by André Scafi
 */

package com.scafisystems.thepokemoninfo.view

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.scafisystems.thepokemoninfo.R
import com.scafisystems.thepokemoninfo.controller.ManagerData


class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        supportActionBar?.hide()
        setContentView(R.layout.activity_splash)

        val data = ManagerData(applicationContext)
        data.getData()

        object : CountDownTimer(3000, 1000) {
            override fun onTick(millisUntilFinished: Long) {}
            override fun onFinish() {
                startActivity(
                    Intent(this@SplashActivity, MainActivity::class.java)
                )
                finish()
            }
        }.start()
    }

}