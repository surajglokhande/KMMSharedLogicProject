package com.suraj.kmmsharedlogicproject

//class AndroidPlatform : Platform {
//    override val name: String = "Android ${android.os.Build.VERSION.SDK_INT}"
//}

//variable
actual val getPlatformVar: Platform = GetPlatformClass()

//fun
actual fun getPlatformFun(): Platform = GetPlatformClass()

// In the jvmMain source set:
actual class GetPlatformClass: Platform {
    actual override val name: String = "Android ${android.os.Build.VERSION.SDK_INT}"
}