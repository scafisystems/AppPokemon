/*
 * Copyright (c) 7/1/2020. Created by André Scafi
 */

package com.scafisystems.thepokemoninfo.model

import org.junit.Assert.*
import org.junit.Test


class BasePokemonResponseTest{



    @Test
    fun must_return_correct_object() {

        val baseDatails1 = BaseDetails("Test1", "www.google.com")
        val baseDatails2 = BaseDetails("Test2", "www.google.com")
        val baseDatails3 = BaseDetails("Test3", "www.gmail.com")
        val list: ArrayList<BaseDetails> = ArrayList()
        list.add(baseDatails1)
        list.add(baseDatails2)
        list.add(baseDatails3)

        val base = BasePokemonResponse(100, list)

        assertEquals(100, base.numberOfPokemon)
        assertEquals(3, list.size)
        assertEquals("www.google.com", list.get(0).url)
        assertEquals("www.gmail.com", list.get(2).url)
        assertEquals("Test2", list.get(1).name)
    }

}