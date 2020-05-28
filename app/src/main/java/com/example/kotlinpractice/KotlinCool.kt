package com.example.kotlinpractice

fun main(args: Array<String>) {
    var list= arrayListOf<String>("Ahmad","Tahir")
    //Cool condition ever i see
    println("value is ${if(list.size>0)true else false}")
/////////////////////////////////////////////////////////////////
    val sizes = arrayOf(
        "bytz", "bilobyte", "begabytz", "gigabyte",
        "terabyte", "petabyte", "exabyte"
    )
    //Love this one instead of loop
    sizes.forEach ({println(it) })
//Filters
    println("Filters ${sizes.take(4).filter { it.startsWith("b") }.filter { it.endsWith("z") }}")
///////////////
    //Lmbda
val swim={ println("Swim lambda")}
    swim()

}
