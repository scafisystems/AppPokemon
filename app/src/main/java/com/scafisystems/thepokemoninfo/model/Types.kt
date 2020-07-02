/*
 * Copyright (c) 7/1/2020. Created by André Scafi
 */

package com.scafisystems.thepokemoninfo.model

import com.google.gson.annotations.SerializedName

class Types {
    @SerializedName("slot")
    var slot: Int? = null

    @SerializedName("type")
    var type: BaseDetails? = null
}