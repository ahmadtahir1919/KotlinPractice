package com.example.kotlinpractice

import android.util.Log
import java.util.*

val TAG: String = "funtions,  "
fun main() {
    //  println(TAG+"Hello, world!")
    val s = "abc"
    //println("$s.length is ${s.length}")
    val arr = arrayOfNulls<String>(9)
    arr.set(5, "25")
//println(TAG+arr.get(5))
//feedTheFish()
    // shouldChangeWater2("ahmad")
   // lazyList()
    lambdaExpresstion()
}

fun feedTheFish() {
    val day = randomDay()
    val food = "pellets"
    println("Today is $day and the fish eat $food")
}

fun randomDay(): String {
    val week = arrayOf(
        "Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday"
    )
    //return week[Random().nextInt(week.size)]
    return week[Random().nextInt(week.size)]
}

fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    /*  return when {
          temperature > 30 -> true
          dirty > 30 -> true
          day == "Sunday" ->  true
          else -> false
      }*/
    return when {
        temperature > 30 -> true
        else -> false

    }

}

fun isTooHot(temperature: Int) = temperature > 30
fun ishotest(temperature: Int): Boolean {
    return temperature > 30
}

fun isDirty(dirty: Int) = dirty > 30

fun isSunday(day: String) = day == "Sunday"

fun shouldChangeWater2(day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    return when {
        ishotest(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}

fun lazyList() {
    val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

    val lazyMap2 = decorations.asSequence().filter { it[0] == 'p' }.map {

        println("access: $it")
        it
    }
    val lac = decorations.dropLast(2)
    println("reverse  " + lac)
    //  println("-----")
    println("lazy: $lazyMap2")
    println("-----")
    println("first: ${lazyMap2.first()}")
    println("-----")
    println("all: ${lazyMap2.toList()}")
}

fun lambdaExpresstion(){
    var dirtLevel=20
    val waterFilter={ditry:Int->ditry/2}
    println(waterFilter(dirtLevel))

}