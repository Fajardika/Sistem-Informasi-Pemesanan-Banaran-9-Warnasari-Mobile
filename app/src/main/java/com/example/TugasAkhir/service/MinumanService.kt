package com.example.TugasAkhir.service


import com.example.TugasAkhir.model.MinumanResponse
import retrofit2.Call
import retrofit2.http.*
import com.example.TugasAkhir.model.*

interface MinumanService{
    @GET ("minuman")
    fun getMinuman() : Call<MinumanResponse>
}