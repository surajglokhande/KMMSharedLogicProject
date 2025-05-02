package com.suraj.kmmsharedlogicproject

import platform.UIKit.UIDevice

//class IOSPlatform: Platform {
//    override val name: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
//}

//variable
actual val getPlatformVar: Platform = GetPlatformClass()

//fun
actual fun getPlatformFun(): Platform = GetPlatformClass()

//class
actual class GetPlatformClass: Platform {
    actual override val name: String = "iOS" + UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}