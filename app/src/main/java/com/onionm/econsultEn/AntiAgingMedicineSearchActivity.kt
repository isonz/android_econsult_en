package com.onionm.econsultEn

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.safframework.log.L
import kotlinx.android.synthetic.main.activity_anti_aging_search.*

@Suppress("REDUNDANT_LABEL_WARNING")
class AntiAgingMedicineSearchActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anti_aging_search)

        item1.setOnClickListener {
            startActivity(Intent(AntiAgingMedicineSearchActivity@this, AntiAgingMedicineInfoActivity::class.java))
        }
        item2.setOnClickListener {
            startActivity(Intent(AntiAgingMedicineSearchActivity@this, AntiAgingMedicineInfoActivity::class.java))
        }
        item3.setOnClickListener {
            startActivity(Intent(AntiAgingMedicineSearchActivity@this, AntiAgingMedicineInfoActivity::class.java))
        }
        item4.setOnClickListener {
            startActivity(Intent(AntiAgingMedicineSearchActivity@this, AntiAgingMedicineInfoActivity::class.java))
        }
        item5.setOnClickListener {
            startActivity(Intent(AntiAgingMedicineSearchActivity@this, AntiAgingMedicineInfoActivity::class.java))
        }
        item6.setOnClickListener {
            startActivity(Intent(AntiAgingMedicineSearchActivity@this, AntiAgingMedicineInfoActivity::class.java))
        }
        item7.setOnClickListener {
            startActivity(Intent(AntiAgingMedicineSearchActivity@this, AntiAgingMedicineInfoActivity::class.java))
        }
        item8.setOnClickListener {
            startActivity(Intent(AntiAgingMedicineSearchActivity@this, AntiAgingMedicineInfoActivity::class.java))
        }

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
