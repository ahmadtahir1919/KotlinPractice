package com.example.kotlinpractice

fun main() {
    val areaOfRecTangle=Area()
    println(areaOfRecTangle(5))
}
fun Area():(Int)->Int{

    return {i:Int->i*i}



}