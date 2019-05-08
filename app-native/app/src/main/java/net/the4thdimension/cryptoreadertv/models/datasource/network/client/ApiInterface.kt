package net.the4thdimension.cryptoreadertv.models.datasource.network.client

import net.the4thdimension.cryptoreadertv.models.dataclasses.Profile

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {

    @GET("/profile")
    fun getProfile(@Query("email") email: String): Call<Profile>
}