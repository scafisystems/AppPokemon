/*
 * Copyright (c) 7/1/2020. Created by André Scafi
 */

package com.scafisystems.thepokemoninfo.model

import com.google.gson.annotations.SerializedName

class Stats {
    @SerializedName("base_stat")
    var baseStat: Int? = null

    @SerializedName("effort")
    var effort: Int? = null

    @SerializedName("stat")
    var stat: BaseDetails? = null

}