package com.example.helloworld

fun main() {
    val list = ArrayList<Double>()
    list.add(1.1)
    list.add(1.2)
    list.add(1.3)
    list.add(1.4)
    list.add(1.5)

    val average = list.average()
    print(average)
}