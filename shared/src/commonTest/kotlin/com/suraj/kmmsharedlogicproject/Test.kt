package com.suraj.kmmsharedlogicproject

import kotlin.test.Test
import kotlin.test.assertTrue

class CommonGreetingTest {

    @Test
    fun testExample() {
        assertTrue(Greeting().greetClass().contains("Hello"), "Check 'Hello' is mentioned")
    }
}