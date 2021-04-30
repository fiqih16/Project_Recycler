package com.example.recycler

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import kotlinx.android.synthetic.main.activity_order.*
import kotlinx.android.synthetic.main.activity_pembayaran.*
import kotlinx.android.synthetic.main.item_layout.*

class pembayaran : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pembayaran)

        supportActionBar!!.setTitle("Pembayaran")
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        val actionBar : ActionBar? = supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)
        actionBar!!.setDisplayHomeAsUpEnabled(true)


        //get data from intent
        var intent = intent
        var pSepatu = intent.getStringExtra("pSepatu")
        var jmlorder = intent.getIntExtra("jmlorder",0)
        var tothar = intent.getIntExtra("tothar", 0)
        var ImgPesan = intent.getIntExtra("pImg",0)
        imgpesanan.setImageResource(ImgPesan)

        val result = findViewById<TextView>(R.id.Pembayaran)
        //setText
        result.text = "Nama Sepatu: $pSepatu \nJumlah Order: " +
                jmlorder.toString() +"\nTotal Harga: " +
                tothar.toString()

        // back btn konfirmasi
        btnKonfirmasi.setOnClickListener {
            onBackPressed()
        }



    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true

    }
}