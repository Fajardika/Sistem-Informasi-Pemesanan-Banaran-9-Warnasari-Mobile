package com.example.TugasAkhir.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.TugasAkhir.R
import com.example.TugasAkhir.model.MinumanDataResponse

internal class MinumanAdapter(private val minumanList: ArrayList<MinumanDataResponse>, private val listener : onAdapterListener)
    : RecyclerView.Adapter<MinumanAdapter.MyViewHolder>(){
    internal inner class MyViewHolder(view : View) : RecyclerView.ViewHolder(view){
        var nama_menu: TextView = view.findViewById(R.id.txt_nama_menu)
        var harga: TextView = view.findViewById(R.id.txt_harga)
        val cv_container_minuman = view.findViewById<CardView>(R.id.id_cv_container_minuman)

        fun bindHolder(minuman : MinumanDataResponse){
            nama_menu.text = minuman.nama_menu
            harga.text = minuman.harga.toString()
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_minuman, parent, false)
        return MyViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: MyViewHolder, position:Int){
        holder.bindHolder(minumanList[position])
    }

    override fun getItemCount():Int {
        return minumanList.size
    }

    fun setData(data : ArrayList<MinumanDataResponse>){
        minumanList.clear()
        minumanList.addAll(data)
        notifyDataSetChanged()
    }
    interface onAdapterListener {
        fun onClick(id_menu :Int, nama_menu : String, harga : Int)
    }
}