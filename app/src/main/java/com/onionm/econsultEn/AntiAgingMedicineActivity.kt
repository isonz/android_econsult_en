package com.onionm.econsultEn

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.safframework.log.L
import kotlinx.android.synthetic.main.activity_anti_aging.*

@Suppress("REDUNDANT_LABEL_WARNING")
class AntiAgingMedicineActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anti_aging)

        item1.setOnClickListener {
            startActivity(Intent(AntiAgingMedicineActivity@this, AntiAgingMedicineSearchActivity::class.java))
        }
        item2.setOnClickListener {
            startActivity(Intent(AntiAgingMedicineActivity@this, AntiAgingMedicineSearchActivity::class.java))
        }
        item3.setOnClickListener {
            startActivity(Intent(AntiAgingMedicineActivity@this, AntiAgingMedicineSearchActivity::class.java))
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
