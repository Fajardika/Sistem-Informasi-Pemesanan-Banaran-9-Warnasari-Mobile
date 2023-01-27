package com.example.TugasAkhir.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class MinumanDataResponse (
    @Expose
    @SerializedName("harga")
    val harga: Int,
    @Expose
    @SerializedName("kode_menu")
    val kode_menu: Int,
    @Expose
    @SerializedName("nama_menu")
    val nama_menu: String
)