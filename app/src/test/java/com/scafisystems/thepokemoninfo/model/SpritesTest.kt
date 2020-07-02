/*
 * Copyright (c) 7/1/2020. Created by André Scafi
 */

package com.scafisystems.thepokemoninfo.model

import org.junit.Assert.*
import org.junit.Test

class SpritesTest{

    @Test
    fun must_return_correct_object() {
        val base = Sprites()
        base.frontImage = "img1"
        base.backImage = "img2"

        assertEquals("img1", base.frontImage)
        assertEquals("img2", base.backImage)
    }
}