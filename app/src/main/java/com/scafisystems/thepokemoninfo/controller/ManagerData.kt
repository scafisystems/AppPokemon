/*
 * Copyright (c) 7/1/2020. Created by André Scafi
 */

package com.scafisystems.thepokemoninfo.controller

import android.content.Context
import android.widget.Toast
import com.scafisystems.thepokemoninfo.model.BasePokemonResponse
import com.scafisystems.thepokemoninfo.model.PokemonDetails
import com.scafisystems.thepokemoninfo.model.PokemonItem
import com.scafisystems.thepokemoninfo.network.Endpoint
import com.scafisystems.thepokemoninfo.network.NetworkUtils
import com.scafisystems.thepokemoninfo.view.MainActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ManagerData(val context: Context) {

    var size = 0

    fun getData() {
        val retrofitClient = NetworkUtils.getRetrofitInstance()
        val endpoint = retrofitClient.create(Endpoint::class.java)
        getNumberOfPokemon(endpoint)

    }

    private fun getNumberOfPokemon(endpoint: Endpoint) {
        val callback = endpoint.getNumber()

        callback.enqueue(object : Callback<BasePokemonResponse> {
            override fun onFailure(call: Call<BasePokemonResponse>, t: Throwable) {
                Toast.makeText(context, t.message, Toast.LENGTH_SHORT).show()
            }

            override fun onResponse(call: Call<BasePokemonResponse>, response: Response<BasePokemonResponse>) {
                size = response.body()?.numberOfPokemon!!
                for(i in 1 until size) {
                    getListOfPokemon(endpoint.getListPokemon(i))
                }
            }
        })
    }

    private fun getListOfPokemon(callback: Call<PokemonDetails>) {

        callback.enqueue(object : Callback<PokemonDetails> {
            override fun onFailure(call: Call<PokemonDetails>, t: Throwable) {
                Toast.makeText(context, t.message, Toast.LENGTH_SHORT).show()
            }

            override fun onResponse(call: Call<PokemonDetails>, response: Response<PokemonDetails>) {
                if(response.body() != null){
                    var body = response.body()!!
                    MainActivity.listOfPokemon.add(body)
                    generateList(body)
                }
            }
        })
    }

    private fun generateList(body: PokemonDetails) {

        if (MainActivity.recyclerViewList == null || MainActivity.recyclerViewList?.isEmpty()!!) {
            MainActivity.recyclerViewList = ArrayList<PokemonItem>()
        }
        body.image.frontImage?.let { PokemonItem(it, body.name) }?.let {
            (MainActivity.recyclerViewList as ArrayList<PokemonItem>).add(it) }

    }
}