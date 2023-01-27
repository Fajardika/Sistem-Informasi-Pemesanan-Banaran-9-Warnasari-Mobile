package com.example.TugasAkhir.service


import com.example.TugasAkhir.model.MakananResponse
import retrofit2.Call
import retrofit2.http.*
import com.example.TugasAkhir.model.*

interface MakananService{
    @GET ("makanan")
    fun getMakanan() : Call<MakananResponse>
}