/*
 * Copyright (c) 7/1/2020. Created by André Scafi
 */

package com.scafisystems.thepokemoninfo.model

import org.junit.Assert.*
import org.junit.Test

class PokemonItemTest{

    @Test
    fun must_return_correct_object() {
        val base = PokemonItem("img1", "Test111")

        assertEquals("img1", base.imageResource)
        assertEquals("Test111", base.name)
    }
}