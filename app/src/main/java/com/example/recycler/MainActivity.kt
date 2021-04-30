package com.example.recycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arrayItem = ArrayList<sepatuModel>()
        arrayItem.add(sepatuModel("Adidas","Adidas cocok untuk pria dan wanita",R.drawable.adidas,25000))
        arrayItem.add(sepatuModel("Brodo","Adidas cocok untuk pria dan wanita",R.drawable.brodo,35000))
        arrayItem.add(sepatuModel("Convers","Adidas cocok untuk pria dan wanita",R.drawable.convers,45000))
        arrayItem.add(sepatuModel("Diadora","Adidas cocok untuk pria dan wanita",R.drawable.diadora,55000))
        arrayItem.add(sepatuModel("League","Adidas cocok untuk pria dan wanita",R.drawable.league,65000))
        arrayItem.add(sepatuModel("New Balance","Adidas cocok untuk pria dan wanita",R.drawable.newbalance,75000))
        arrayItem.add(sepatuModel("Nike","Adidas cocok untuk pria dan wanita",R.drawable.nike,85000))
        arrayItem.add(sepatuModel("Puma","Adidas cocok untuk pria dan wanita",R.drawable.puma,95000))
        arrayItem.add(sepatuModel("Rebook","Adidas cocok untuk pria dan wanita",R.drawable.recook,100000))
        arrayItem.add(sepatuModel("Vans","Adidas cocok untuk pria dan wanita",R.drawable.vans,110000))
        arrayItem.add(sepatuModel("Wakai","Adidas cocok untuk pria dan wanita",R.drawable.wakai,120000))

        var myAdapter = sepatuAdapter(arrayItem,this)

        RV_Sepatu.layoutManager = LinearLayoutManager(this)
        RV_Sepatu.adapter = myAdapter
    }
}