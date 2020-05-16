package com.example.kotlinpractice.models

open class Aquarium (open var length: Int = 100, open var width: Int = 20, open var height: Int = 40) {
    open val shape = "rectangle"

    open var water: Double = 0.0
        get() = volume * 0.9

    open var volume: Int=4
        get() = width * height * length / 1000

    fun printSize() {
        println(shape)
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")
        // 1 l = 1000 cm^3
        println("Volume: $volume l Water: $water l (${water/volume*100.0}% full)")
    }
}