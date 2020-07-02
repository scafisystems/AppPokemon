/*
 * Copyright (c) 7/1/2020. Created by André Scafi
 */

package com.scafisystems.thepokemoninfo.model

import org.junit.Assert.*
import org.junit.Test

class TypesTest{

    @Test
    fun must_return_correct_object() {
        val base = Types()
        base.slot = 5
        base.type = BaseDetails("Test1", "www.google.com")

        assertEquals(5, base.slot)
        assertEquals("www.google.com", base.type!!.url)
        assertEquals("Test1", base.type!!.name)
    }
}