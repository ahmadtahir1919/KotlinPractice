package com.example.kotlinpractice

/*
*   1. List and ArrayList
* */
fun main(args: Array<String>) {

    // Elements :
    // Index    :   0   1   2   3   4

//    var list = mutableListOf<String>()  // Mutable, No Fixed Size, Can Add or Remove Elements
//    var list = arrayListOf<String>()    // Mutable, No Fixed Size, Can Add or Remove Elements
    var list = ArrayList<String>()      // Mutable, No Fixed Size, Can Add or Remove Elements
    list.add("Ahmad")        // 0
    list.add("Tahir")    // 1
    list.add("Ali")    // 2

//    list.remove("Manmohan")
//    list.add("Vajpayee")

    list[1] = "Nouman"

    for ((index, element) in list.withIndex()) {             // Using individual elements (Objects)
        // println("Index is $element of index of $index")
    }
    val array = arrayOf(10)
    val sizes = arrayOf(
        "bytz", "bilobyte", "begabytz", "gigabyte",
        "terabyte", "petabyte", "exabyte"
    )
//Filters
println("Filters ${sizes.take(4).filter { it.startsWith("b") }.filter { it.endsWith("z") }}")

    for ((i, value) in array.withIndex()) {
        //   println("1 ${sizes[i]} = ${value.toLong()} bytes")
    }

    var list3: MutableList<Int> = mutableListOf()
    for (i in 0..100 step 7)
        list3.add(i)
        print(list3)



}