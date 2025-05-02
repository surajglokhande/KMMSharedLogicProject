package com.suraj.kmmsharedlogicproject

import org.junit.Assert.assertTrue
import org.junit.Test

class AndroidGreetingTest {

    @Test
    fun testExample() {
        assertTrue("Check Android is mentioned", Greeting().greetClass().contains("Android"))
    }
}