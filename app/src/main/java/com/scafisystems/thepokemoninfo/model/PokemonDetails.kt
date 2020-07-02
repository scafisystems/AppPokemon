/*
 * Copyright (c) 7/1/2020. Created by André Scafi
 */

package com.scafisystems.thepokemoninfo.model

import com.google.gson.annotations.SerializedName

data class PokemonDetails(
    @SerializedName("name")
    var name: String,
    @SerializedName("stats")
    var stats: List<Stats>,
    @SerializedName("types")
    var types: List<Types>,
    @SerializedName("sprites")
    var image: Sprites
)