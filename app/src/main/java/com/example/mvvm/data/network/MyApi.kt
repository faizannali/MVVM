package com.example.mvvm.data.network

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface MyApi {
    @FormUrlEncoded
    @POST("Api.php?apicall=login")
    fun userLogin(@Field("username")username:String, @Field("password")password:String):Call<ResponseBody>

    companion object{
        operator fun invoke():MyApi{
            return Retrofit.Builder()
                    .baseUrl("http://192.168.3.105/android/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                    .create(MyApi::class.java)
        }
    }

}