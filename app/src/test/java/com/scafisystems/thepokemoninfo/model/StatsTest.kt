/*
 * Copyright (c) 7/1/2020. Created by André Scafi
 */

package com.scafisystems.thepokemoninfo.model

import org.junit.Assert.*
import org.junit.Test

class StatsTest{

    @Test
    fun must_return_correct_object() {
        val base = Stats()
        base.baseStat = 1
        base.effort = 2
        base.stat = BaseDetails("Test1", "www.google.com")

        assertEquals(1, base.baseStat)
        assertEquals(2, base.effort)
        assertEquals("Test1", base.stat!!.name)
        assertEquals("www.google.com", base.stat!!.url)
    }
}