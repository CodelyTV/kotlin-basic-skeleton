package com.codely.demo

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CodelyberTest {
    @Test
    fun `it should greet successfully`() {
        val expectedGreet = "Welcome to kotlin skeleton!!!"
        assertEquals(expectedGreet, Codelyber().greet())
    }
}
