/*
 * Copyright (c) 7/1/2020. Created by André Scafi
 */

package com.scafisystems.thepokemoninfo.model

import com.google.gson.annotations.SerializedName

data class BaseDetails(
    @SerializedName("name")
    var name : String,
    @SerializedName("url")
    var url : String
)