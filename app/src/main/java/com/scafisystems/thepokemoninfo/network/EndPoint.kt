/*
 * Copyright (c) 7/1/2020. Created by André Scafi
 */

package com.scafisystems.thepokemoninfo.network


import com.scafisystems.thepokemoninfo.model.BasePokemonResponse
import com.scafisystems.thepokemoninfo.model.PokemonDetails
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface Endpoint {

    @GET("api/v2/pokemon/?offset=0&limit=1000")
    fun getNumber(): Call<BasePokemonResponse>

    @GET("api/v2/pokemon/{id}")
    fun getListPokemon(@Path("id") id: Int?): Call<PokemonDetails>

}