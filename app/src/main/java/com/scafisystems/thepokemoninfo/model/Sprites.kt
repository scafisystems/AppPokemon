/*
 * Copyright (c) 7/1/2020. Created by André Scafi
 */

package com.scafisystems.thepokemoninfo.model

import com.google.gson.annotations.SerializedName

class Sprites {
    @SerializedName("front_default")
    var frontImage: String? = null

    @SerializedName("back_default")
    var backImage: String? = null
}