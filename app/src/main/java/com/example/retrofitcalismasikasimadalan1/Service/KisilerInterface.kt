package com.example.retrofitcalismasikasimadalan1.Service

import com.example.retrofitcalismasikasimadalan1.Datai.CRUDCevap
import com.example.retrofitcalismasikasimadalan1.Datai.Kisiler
import com.example.retrofitcalismasikasimadalan1.Datai.KisilerCevap
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface KisilerInterface {
    @POST("kisiler/delete_kisiler.php")
    @FormUrlEncoded //Türkçe karakter desteği sağlıyor
    fun kisiSil(@Field("kisi_id") kisi_Id:Int) : Call<CRUDCevap> //Field içinde veritabanında tanımlı olan veri isimini verdik


    @POST("kisiler/insert_kisiler.php")
    @FormUrlEncoded
    fun kisiEkle(@Field("kisi_ad")kisi_ad:String
                 ,@Field("kisi_tel")kisi_tel:String):Call<CRUDCevap>

    @POST("kisiler/update_kisiler.php")
    @FormUrlEncoded
    fun kisiGuncelle(@Field("kisi_id")kisi_Id:Int
        ,@Field("kisi_ad")kisi_ad:String
                 ,@Field("kisi_tel")kisi_tel:String):Call<CRUDCevap>

    @GET("kisiler/tum_kisiler.php")
    fun tumKisiler():Call<KisilerCevap>

    @POST("kisiler/tum_kisiler_arama.php")
    @FormUrlEncoded
    fun kisiara(@Field("kisi_ad")kisi_ad:String):Call<KisilerCevap>

}