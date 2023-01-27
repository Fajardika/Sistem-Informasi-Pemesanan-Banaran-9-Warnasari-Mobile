package com.example.TugasAkhir

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.TugasAkhir.R
import com.example.TugasAkhir.adapter.MinumanAdapter
import com.example.TugasAkhir.model.MinumanResponse
import com.example.TugasAkhir.service.MinumanService
import com.example.TugasAkhir.util.Retro
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MinumanFragment : Fragment() {
    private lateinit var rv_minuman : RecyclerView
    private lateinit var minumanAdapter: MinumanAdapter

    override fun onCreateView(
        inflater : LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?{
        return inflater.inflate(R.layout.fragment_minuman,container, false)
    }

    override fun onViewCreated(view:View,savedInstanceState:Bundle?){
        super.onViewCreated(view,savedInstanceState)
        minumanAdapter = MinumanAdapter(arrayListOf(),object : MinumanAdapter.onAdapterListener{
            override fun  onClick(kode_menu: Int, nama_menu: String, harga: Int){
            }
        })
        rv_minuman = view.findViewById(R.id.rv_minuman)
        rv_minuman.setHasFixedSize(true)
        rv_minuman.layoutManager = LinearLayoutManager(activity)
        rv_minuman.adapter = minumanAdapter
        getMinumanApi()
    }
    fun getMinumanApi(){
        val retro = Retro().getRetroClientInstance().create(MinumanService::class.java)
        retro.getMinuman().enqueue(object : Callback<MinumanResponse>{
            override fun onResponse(call: Call<MinumanResponse>, response: Response<MinumanResponse>){
                if (response.isSuccessful){
                    val minuman = response.body()!!
                    minumanAdapter.setData(minuman.data!!)
                    Log.e("Nama Minuman :",minuman.data.toString())
                }else {
                    Log.e("Error Code : ",response.code().toString())
                    Log.e("Error Code : ",response.message().toString())
                }
            }

            override fun onFailure(call: Call<MinumanResponse>, t: Throwable){
                Log.e("Failed",t.message.toString())
            }
        })
    }
}