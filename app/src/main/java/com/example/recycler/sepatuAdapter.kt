package com.example.recycler

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_layout.view.*

class sepatuAdapter (val arrayList: ArrayList<sepatuModel>,
                      val context: Context) :
    RecyclerView.Adapter<sepatuAdapter.ViewHolder>() {

    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        fun bindItems(model : sepatuModel){
            itemView.NamaSepatu.text    =   model.nmSepatu
            itemView.descSepatu.text    =   model.desSepatu
            itemView.hargaSepatu.text   =   model.hargaSepatu.toString()
            itemView.imgSepatu.setImageResource(model.imageSepatu)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(arrayList[position])

        holder.itemView.setOnClickListener(){
            val model = arrayList.get(position)

            val gsepatu : String = model.nmSepatu
            var gDesc   : String = model.desSepatu
            var gharga  : Int    = model.hargaSepatu.toString().toInt()
            var gImg    : Int    = model.imageSepatu

            val intent = Intent(context, OrderActivity::class.java)
            intent.putExtra("pSepatu", gsepatu)
            intent.putExtra("pDesc", gDesc)
            intent.putExtra("pHarga", gharga)
            intent.putExtra("pImg", gImg)

            context.startActivity(intent)
        }

    }


}
