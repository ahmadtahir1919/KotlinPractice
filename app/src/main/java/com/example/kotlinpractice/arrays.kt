package com.example.kotlinpractice

/*
*   1. Arrays
* */
fun main(args: Array<String>) {

    // Elements :   32  0   0   54  0
    // Index    :   0   1   2   3   4

    var myArray = ArrayList<Int>(5)   // Mutable. Fixed Size.
    myArray[0] = 32
    myArray[3] = 54
    myArray[1] = 11

    for (element in myArray) {              // Using individual elements (Objects)
        println(element)
    }

    println()

    for (index in 0..4) {
        println(myArray[index])
    }
}