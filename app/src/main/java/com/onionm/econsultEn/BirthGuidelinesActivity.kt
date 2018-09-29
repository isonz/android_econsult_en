package com.onionm.econsultEn

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.view.menu.MenuBuilder
import android.view.Menu
import com.safframework.log.L
import kotlinx.android.synthetic.main.activity_birth_guide.*

@Suppress("REDUNDANT_LABEL_WARNING")
class BirthGuidelinesActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birth_guide)

        item1.setOnClickListener {
            startActivity(Intent(BirthGuidelinesActivity@this, BirthGuidelinesInfoActivity::class.java))
        }
        item2.setOnClickListener {
            startActivity(Intent(BirthGuidelinesActivity@this, BirthGuidelinesInfoActivity::class.java))
        }
        item3.setOnClickListener {
            startActivity(Intent(BirthGuidelinesActivity@this, BirthGuidelinesInfoActivity::class.java))
        }
        item4.setOnClickListener {
            startActivity(Intent(BirthGuidelinesActivity@this, BirthGuidelinesInfoActivity::class.java))
        }

    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menu.let {
            if (menu is MenuBuilder) {
                try {
                    val field = menu.javaClass.getDeclaredField("mOptionalIconsVisible")
                    field.isAccessible = true
                    field.setBoolean(menu, true)
                } catch (ignored: Exception) {
                    // ignored exception
                }
            }
        }
        val inflater = menuInflater
        inflater.inflate(R.menu.actionbar_menu, menu)
        return super.onCreateOptionsMenu(menu)
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
