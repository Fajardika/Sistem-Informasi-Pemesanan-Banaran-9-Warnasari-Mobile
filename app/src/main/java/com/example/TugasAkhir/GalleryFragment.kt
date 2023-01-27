package com.example.TugasAkhir

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.TugasAkhir.R
import com.example.TugasAkhir.adapter.GalleryAdapter
import com.example.TugasAkhir.model.GalleryModel


class GalleryFragment : Fragment() {
    private lateinit var rv_koleksi : RecyclerView
    private lateinit var koleksiadapter: GalleryAdapter
    private lateinit var gridLayoutManager: GridLayoutManager
    private lateinit var arrayList : ArrayList<GalleryModel>

    override fun onCreateView(
        inflater : LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?{
        return inflater.inflate(R.layout.fragment_gallery,container, false)
    }

    override fun onViewCreated(view:View,savedInstanceState:Bundle?){
        super.onViewCreated(view,savedInstanceState)

        rv_koleksi = view.findViewById(R.id.rv_koleksi)
        gridLayoutManager = GridLayoutManager(context, 3, LinearLayoutManager.VERTICAL, false)
        rv_koleksi.layoutManager = gridLayoutManager
        rv_koleksi.setHasFixedSize(true)
        arrayList = ArrayList()
        arrayList = setDataInList()
        koleksiadapter = GalleryAdapter(context, arrayList!!)
        rv_koleksi.adapter = koleksiadapter


    }
    private fun setDataInList():ArrayList<GalleryModel>{
        var items:ArrayList<GalleryModel> = ArrayList()

        items.add(GalleryModel(R.drawable.menu1, "Cah Kangkung"))
        items.add(GalleryModel(R.drawable.menu2, "Gado-Gado"))
        items.add(GalleryModel(R.drawable.menu3, "Iga Bakar"))
        items.add(GalleryModel(R.drawable.menu4, "Ikan Bakar"))
        items.add(GalleryModel(R.drawable.menu5, "Kentang Goreng"))
        items.add(GalleryModel(R.drawable.menu6, "Ketela Goreng"))
        items.add(GalleryModel(R.drawable.menu7, "Ketela Keju"))
        items.add(GalleryModel(R.drawable.menu8, "Mendoan"))
        items.add(GalleryModel(R.drawable.menu9, "Mie Goreng"))
        items.add(GalleryModel(R.drawable.menu10, "Mie Goreng Jawa"))
        items.add(GalleryModel(R.drawable.menu11, "Mie Kuah"))
        items.add(GalleryModel(R.drawable.menu12, "Mie Kuah Jawa"))
        items.add(GalleryModel(R.drawable.menu13, "Nasi Ayam Banaran"))
        items.add(GalleryModel(R.drawable.menu14, "Nasi Ayam Goreng"))
        items.add(GalleryModel(R.drawable.menu15, "Nasi Ayam Kosek"))
        items.add(GalleryModel(R.drawable.menu16, "Nasi Ayam Kremes"))
        items.add(GalleryModel(R.drawable.menu17, "Nasi Goreng Hijau"))
        items.add(GalleryModel(R.drawable.menu18, "Nasi Goreng Kremes"))
        items.add(GalleryModel(R.drawable.menu19, "Nasi Goreng Merah"))
        items.add(GalleryModel(R.drawable.menu20, "Nasi Goreng Putih"))
        items.add(GalleryModel(R.drawable.menu21, "Nasi Pecel Telur"))
        items.add(GalleryModel(R.drawable.menu22, "Nasi Rawon"))
        items.add(GalleryModel(R.drawable.menu23, "Nasi Soto Banaran"))
        items.add(GalleryModel(R.drawable.menu24, "Nasi Timbel"))
        items.add(GalleryModel(R.drawable.menu25, "Pecel Lele"))
        items.add(GalleryModel(R.drawable.menu26, "Pisang Goreng"))
        items.add(GalleryModel(R.drawable.menu27, "Pisang Keju"))
        items.add(GalleryModel(R.drawable.menu28, "Pisang Madu"))
        items.add(GalleryModel(R.drawable.menu29, "Pisang Penyet"))
        items.add(GalleryModel(R.drawable.menu30, "Snack Kombinasi"))
        items.add(GalleryModel(R.drawable.menu31, "Sop Iga"))
        items.add(GalleryModel(R.drawable.menu32, "Tahu Goreng"))
        items.add(GalleryModel(R.drawable.menu33, "Black Coffee"))
        items.add(GalleryModel(R.drawable.menu34, "Es Black Tea"))
        items.add(GalleryModel(R.drawable.menu35, "Es Cappucino"))
        items.add(GalleryModel(R.drawable.menu36, "Es Choco Latte"))
        items.add(GalleryModel(R.drawable.menu37, "Es Coffe Latte"))
        items.add(GalleryModel(R.drawable.menu38, "Es Jeruk Nipis"))
        items.add(GalleryModel(R.drawable.menu39, "Es Kopi Cream"))
        items.add(GalleryModel(R.drawable.menu40, "Es Lemon Tea"))
        items.add(GalleryModel(R.drawable.menu50, "Es Macchiato"))
        items.add(GalleryModel(R.drawable.menu51, "Es Moccacino"))
        items.add(GalleryModel(R.drawable.menu52, "Es Soda Gembira"))
        items.add(GalleryModel(R.drawable.menu53, "Es Tea Cream"))
        items.add(GalleryModel(R.drawable.menu54, "Expreso Coffee"))
        items.add(GalleryModel(R.drawable.menu55, "Hot Cappuccino"))
        items.add(GalleryModel(R.drawable.menu56, "Hot Choco Latte"))
        items.add(GalleryModel(R.drawable.menu57, "Hot Coffee Latte"))
        items.add(GalleryModel(R.drawable.menu58, "Hot Macchiato"))
        items.add(GalleryModel(R.drawable.menu59, "Hot Moccacino"))
        items.add(GalleryModel(R.drawable.menu60, "Jeruk Nipis Panas"))
        items.add(GalleryModel(R.drawable.menu61, "Jeruk Panas"))
        items.add(GalleryModel(R.drawable.menu62, "Juice Banana Coffee"))
        items.add(GalleryModel(R.drawable.menu63, "Jus Alpukat"))
        items.add(GalleryModel(R.drawable.menu64, "Jus Anti Kolesterol"))
        items.add(GalleryModel(R.drawable.menu65, "Jus Apel"))
        items.add(GalleryModel(R.drawable.menu67, "Jus Jeruk"))
        items.add(GalleryModel(R.drawable.menu68, "Jus Leci"))
        items.add(GalleryModel(R.drawable.menu69, "Jus Mangga"))
        items.add(GalleryModel(R.drawable.menu70, "Jus Melon"))
        items.add(GalleryModel(R.drawable.menu72, "Jus Seledri"))
        items.add(GalleryModel(R.drawable.menu73, "Jus Sirsak"))
        items.add(GalleryModel(R.drawable.menu74, "Jus Strawberry"))
        items.add(GalleryModel(R.drawable.menu75, "Jus Tomat"))
        items.add(GalleryModel(R.drawable.menu76, "Lemon Tea"))
        items.add(GalleryModel(R.drawable.menu77, "Poci Tea"))
        items.add(GalleryModel(R.drawable.menu78, "Special Coffee"))
        items.add(GalleryModel(R.drawable.menu79, "Susu Jahe"))
        items.add(GalleryModel(R.drawable.menu80, "Tea Latte"))
        items.add(GalleryModel(R.drawable.menu81, "Tubruk Coffee"))
        items.add(GalleryModel(R.drawable.menu82, "Wedang Jahe"))
        items.add(GalleryModel(R.drawable.menu83, "Wedang uwuh"))
        return  items
    }

}