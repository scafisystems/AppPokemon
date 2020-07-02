/*
 * Copyright (c) 7/1/2020. Created by André Scafi
 */

package com.scafisystems.thepokemoninfo.model

import com.google.gson.annotations.SerializedName

data class BasePokemonResponse(

    @SerializedName("count")
    var numberOfPokemon : Int,

    @SerializedName("results")
    var listOfPokemon : ArrayList<BaseDetails>

)