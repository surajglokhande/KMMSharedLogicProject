package com.suraj.kmmsharedlogicproject

interface Platform {
    val name: String
}

//variable
expect val getPlatformVar: Platform

//fun
expect fun getPlatformFun(): Platform

// In the commonMain source set:
expect class GetPlatformClass(): Platform {
    override val name: String
}