package com.example.TugasAkhir.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class MakananResponse(
    @Expose
    @SerializedName ("code")
    val code: Int,
    @Expose
    @SerializedName("errors")
    val errors: Any,
    @Expose
    @SerializedName("message")
    val message: String,
    @Expose
    @SerializedName("data")
    val data: ArrayList<MakananDataResponse>?
)