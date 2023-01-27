package com.example.TugasAkhir.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.TugasAkhir.R
import com.example.TugasAkhir.model.GalleryModel

class GalleryAdapter(var context: Context?, var arrayList: ArrayList<GalleryModel>):
    RecyclerView.Adapter<GalleryAdapter.ItemHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        val itemHolder = LayoutInflater.from(parent.context).inflate(R.layout.item_gallery, parent, false)
        return ItemHolder(itemHolder)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {

        var model: GalleryModel = arrayList.get(position)
        holder.gambar.setImageResource(model.gambarMenu!!)
        holder.nama.text = model.namaMenu
    }

    class ItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var gambar = itemView.findViewById<ImageView>(R.id.gambar_menu)
        var nama = itemView.findViewById<TextView>(R.id.nama_menu)
    }
}