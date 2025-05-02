package com.suraj.kmmsharedlogicproject

class Greeting {
    private val platformVar: Platform = getPlatformVar
    private val platformFun: Platform = getPlatformFun()
    private val platformClass: Platform = GetPlatformClass()

    fun greetVar(): String {
        return " variable from Greeting class, ${platformVar.name}!"
    }
    fun greetFun(): String {
        return " function from Greeting class, ${platformFun.name}!"
    }
    fun greetClass(): String {
        return " class from Greeting class, ${platformClass.name}!"
    }
}