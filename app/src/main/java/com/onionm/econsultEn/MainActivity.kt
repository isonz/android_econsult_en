package com.onionm.econsultEn

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.support.v7.view.menu.MenuBuilder
import android.view.Menu
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.navigation.*

@Suppress("REDUNDANT_LABEL_WARNING")
class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.nav_home -> {
                nav_home.visibility = View.VISIBLE
                nav_message.visibility = View.GONE
                nav_my.visibility = View.GONE
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_message -> {
                nav_home.visibility = View.GONE
                nav_message.visibility = View.VISIBLE
                nav_my.visibility = View.GONE
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_my -> {
                nav_home.visibility = View.GONE
                nav_message.visibility = View.GONE
                nav_my.visibility = View.VISIBLE
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation_bottom.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

        icon_1.setOnClickListener{
            startActivity(Intent(MainActivity@this, BirthGuidelinesActivity::class.java))
        }
        icon_2.setOnClickListener{
            startActivity(Intent(MainActivity@this, ClinicalTrialsActivity::class.java))
        }
        icon_3.setOnClickListener{
            startActivity(Intent(MainActivity@this, AntiAgingMedicineActivity::class.java))
        }
        icon_4.setOnClickListener{
            startActivity(Intent(MainActivity@this, PreventiveMedicineActivity::class.java))
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

}
