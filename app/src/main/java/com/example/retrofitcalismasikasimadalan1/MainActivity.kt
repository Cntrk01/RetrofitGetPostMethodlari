package com.example.retrofitcalismasikasimadalan1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.retrofitcalismasikasimadalan1.Datai.CRUDCevap
import com.example.retrofitcalismasikasimadalan1.Datai.KisilerCevap
import com.example.retrofitcalismasikasimadalan1.Service.ApiUtils
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //kisiSil()
        //kisiEkle()
        kisiGetir()
        kisiAra()
    }


    fun kisiSil(){
        val kSil=ApiUtils.getKisilerInterface()

        kSil.kisiSil(14223).enqueue(object : Callback<CRUDCevap>{
            override fun onResponse(call: Call<CRUDCevap>, response: Response<CRUDCevap>) {
                if(response !=null){
                    Log.e("Başarılı", response.body()?.succes.toString())
                    Log.e("Mesaj", response.body()?.message.toString())
                }
            }

            override fun onFailure(call: Call<CRUDCevap>, t: Throwable) {

            }

        })
    }

    fun kisiEkle(){
        val kSil=ApiUtils.getKisilerInterface()

        kSil.kisiEkle("CanBey","01.01").enqueue(object : Callback<CRUDCevap>{
            override fun onResponse(call: Call<CRUDCevap>, response: Response<CRUDCevap>) {
                if(response !=null){
                    Log.e("Başarılı", response.body()?.succes.toString())
                    Log.e("Mesaj", response.body()?.message.toString())
                }
            }

            override fun onFailure(call: Call<CRUDCevap>, t: Throwable) {

            }

        })
    }

    fun kisiGuncelle(){
        val kSil=ApiUtils.getKisilerInterface()

        kSil.kisiGuncelle(1,"CanBey","01.01").enqueue(object : Callback<CRUDCevap>{
            override fun onResponse(call: Call<CRUDCevap>, response: Response<CRUDCevap>) {
                if(response !=null){
                    Log.e("Başarılı", response.body()?.succes.toString())
                    Log.e("Mesaj", response.body()?.message.toString())
                }
            }

            override fun onFailure(call: Call<CRUDCevap>, t: Throwable) {

            }

        })
    }

    fun kisiGetir(){
        val kSil=ApiUtils.getKisilerInterface()

        kSil.tumKisiler().enqueue(object : Callback<KisilerCevap>{
            override fun onResponse(call: Call<KisilerCevap>, response: Response<KisilerCevap>) {
                if(response !=null){
                    val kisiListe=response.body()?.kisiler

                    if (kisiListe != null) {
                        for (k in kisiListe){
                            Log.e("kisiId",k.kisiId.toString())
                        }
                    }
                }
            }

            override fun onFailure(call: Call<KisilerCevap>, t: Throwable) {

            }


        })
    }

    fun kisiAra(){
        val kSil=ApiUtils.getKisilerInterface()

        kSil.kisiara("Can").enqueue(object : Callback<KisilerCevap>{
            override fun onResponse(call: Call<KisilerCevap>, response: Response<KisilerCevap>?) {
                if(response !=null){
                    val kisiListe=response.body()?.kisiler

                        for (k in kisiListe!!){
                            Log.e("kisiId",k.kisiId.toString())
                        }

                }
            }

            override fun onFailure(call: Call<KisilerCevap>, t: Throwable) {

            }


        })
    }
}