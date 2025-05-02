package com.suraj.kmmsharedlogicproject

import kotlin.test.Test
import kotlin.test.assertTrue

class IosGreetingTest {

    @Test
    fun testExample() {
        assertTrue(Greeting().greetClass().contains("iOS"), "Check iOS is mentioned")
    }
}