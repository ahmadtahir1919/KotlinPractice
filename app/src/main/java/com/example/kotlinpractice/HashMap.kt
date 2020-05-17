package com.example.kotlinpractice

/*
*   1. Map and HashMap
* */
fun main(args: Array<String>) {

    // Map Tutorial: Key-Value pair
//    var myMap = HashMap<Int, String>()      // Mutable, READ and WRITE both, No Fixed Size
//    var myMap = mutableMapOf<Int, String>() // Mutable, READ and WRITE both, No Fixed Size
    var myMap = hashMapOf<Int, String>()      // Mutable, READ and WRITE both, No Fixed Size

    myMap.put(4, "Ahmad")
    myMap.put(43, "Tahir")
    myMap.put(7, "Ali")

    myMap.put(43, "Nouman")

    for (key in myMap.keys) {
        println("Element at $key = ${myMap[key]}")  // myMap.get(key)
    }
}