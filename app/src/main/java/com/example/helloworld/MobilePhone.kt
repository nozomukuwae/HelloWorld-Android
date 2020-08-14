package com.example.helloworld

class MobilePhone (osName: String, brand: String) {
    private var battery = 0

    init {
        println("This phone's OS is $osName and the brand is $brand.")
    }

    fun chargeBattery(by: Int) {
        battery += by
    }
}

fun main() {
    val phone1 = MobilePhone("Android", "Samsung")
    val phone2 = MobilePhone("iOS", "iPhone")
}