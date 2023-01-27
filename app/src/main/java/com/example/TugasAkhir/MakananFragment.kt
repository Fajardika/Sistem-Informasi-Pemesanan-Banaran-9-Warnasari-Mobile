package com.example.TugasAkhir

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.TugasAkhir.R
import com.example.TugasAkhir.adapter.MakananAdapter
import com.example.TugasAkhir.model.MakananResponse
import com.example.TugasAkhir.service.MakananService
import com.example.TugasAkhir.util.Retro
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MakananFragment : Fragment() {
    private lateinit var rv_makanan : RecyclerView
    private lateinit var makananAdapter: MakananAdapter

    override fun onCreateView(
        inflater : LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?{
        return inflater.inflate(R.layout.fragment_makanan,container, false)
    }

    override fun onViewCreated(view:View,savedInstanceState:Bundle?){
        super.onViewCreated(view,savedInstanceState)
        makananAdapter = MakananAdapter(arrayListOf(),object : MakananAdapter.onAdapterListener{
            override fun  onClick(kode_menu: Int, nama_menu: String, harga: Int){
            }
        })
        rv_makanan = view.findViewById(R.id.rv_makanan)
        rv_makanan.setHasFixedSize(true)
        rv_makanan.layoutManager = LinearLayoutManager(activity)
        rv_makanan.adapter = makananAdapter
        getMakananApi()
    }
    fun getMakananApi(){
        val retro = Retro().getRetroClientInstance().create(MakananService::class.java)
        retro.getMakanan().enqueue(object : Callback<MakananResponse>{
            override fun onResponse(call: Call<MakananResponse>, response: Response<MakananResponse>){
                if (response.isSuccessful){
                    val makanan = response.body()!!
                    makananAdapter.setData(makanan.data!!)
                    Log.e("Nama Makanan :",makanan.data.toString())
                }else {
                    Log.e("Error Code : ",response.code().toString())
                    Log.e("Error Code : ",response.message().toString())
                }
            }

            override fun onFailure(call: Call<MakananResponse>, t: Throwable){
                Log.e("Failed",t.message.toString())
            }
        })
    }
}