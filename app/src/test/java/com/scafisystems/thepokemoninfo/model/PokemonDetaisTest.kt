/*
 * Copyright (c) 7/1/2020. Created by André Scafi
 */

package com.scafisystems.thepokemoninfo.model

import org.junit.Assert.*
import org.junit.Test


class PokemonDetaisTest{

    @Test
    fun must_return_correct_object() {

        val stats: List<Stats> = listOf(Stats(),Stats())
        val types: List<Types> = listOf(Types(),Types(), Types())

        val base = PokemonDetails("Test1", stats, types, Sprites())

        assertEquals("Test1", base.name)
        assertEquals(2, base.stats.size)
        assertEquals(3, base.types.size)
        assertEquals(null, base.image.frontImage)

    }

}