package com.onionm.econsultEn

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.safframework.log.L
import kotlinx.android.synthetic.main.activity_birth_guide.*

@Suppress("REDUNDANT_LABEL_WARNING")
class BirthGuidelinesActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

//        submit_login.setOnClickListener {
//            startActivity(Intent(LoginActivity@this, MainActivity::class.java))
//        }

    }

    // 包裹范围内 属于静态方法
    companion object {
        //
    }

    override fun onDestroy() {
        L.i("LoginActivity ON destroy")
        super.onDestroy()
    }

    override fun onStart() {
        L.i("LoginActivity ON start")
        super.onStart()
    }




}