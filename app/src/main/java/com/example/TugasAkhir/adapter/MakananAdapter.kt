package com.example.TugasAkhir.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.TugasAkhir.R
import com.example.TugasAkhir.model.MakananDataResponse

internal class MakananAdapter(private val makananList: ArrayList<MakananDataResponse>, private val listener : onAdapterListener)
    : RecyclerView.Adapter<MakananAdapter.MyViewHolder>(){
    internal inner class MyViewHolder(view : View) : RecyclerView.ViewHolder(view){
        var nama_menu: TextView = view.findViewById(R.id.txt_nama_menu)
        var harga: TextView = view.findViewById(R.id.txt_harga)
        val cv_container_makanan = view.findViewById<CardView>(R.id.id_cv_container_makanan)

        fun bindHolder(makanan : MakananDataResponse){
            nama_menu.text = makanan.nama_menu
            harga.text = makanan.harga.toString()
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_makanan, parent, false)
        return MyViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: MyViewHolder, position:Int){
        holder.bindHolder(makananList[position])
    }

    override fun getItemCount():Int {
        return makananList.size
    }

    fun setData(data : ArrayList<MakananDataResponse>){
        makananList.clear()
        makananList.addAll(data)
        notifyDataSetChanged()
    }
    interface onAdapterListener {
        fun onClick(id_menu :Int, nama_menu : String, harga : Int)
    }
}