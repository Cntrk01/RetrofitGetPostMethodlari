package com.example.retrofitcalismasikasimadalan1.Datai

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CRUDCevap(
    @SerializedName("success")
    @Expose
    var succes:Int,

    @SerializedName("message")
    @Expose
    var message:String

)
