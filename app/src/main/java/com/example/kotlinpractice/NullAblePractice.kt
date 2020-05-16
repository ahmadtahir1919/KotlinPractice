package com.example.kotlinpractice

val value: String? = null
fun main() {
    //nullPointers()
    InitOrderDemo("Ahmad")
}

private fun nullPointers() {
    println(" value is ${value?.length}")

    value?.let {
        println(" value is ${value?.length}")

    }
    println("value is ${value?.length ?: " vaue is null"}")

    //Through exception if value is null
    println("value is ${value!!.length}")
}

class InitOrderDemo(name: String) {
    val firstProperty = "First property: $name".also(::println)

    init {
        println("First initializer block that prints ${name}")
    }

    val secondProperty = "Second property: ${name.length}".also(::println)

    init {
        println("Second initializer block that prints ${name.length}")
    }
}