/*
 * Copyright (c) 7/1/2020. Created by André Scafi
 */

package com.scafisystems.thepokemoninfo.model

import org.junit.Assert.*
import org.junit.Test


class BaseDatailsTest{

    @Test
    fun must_return_correct_object() {
        val baseDatails = BaseDetails("Test1", "www.google.com")
        assertEquals("Test1", baseDatails.name)
        assertEquals("www.google.com", baseDatails.url)
    }

}