package com.example.retrofitcalismasikasimadalan1.Service

class ApiUtils {

    companion object{
        val BASE_URL="http://kasimadalan.pe.hu/"

        fun getKisilerInterface():KisilerInterface{
            return RetrofitClient.getClient(BASE_URL).create(KisilerInterface::class.java)
        }
    }


}