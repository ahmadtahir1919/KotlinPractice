package com.example.kotlinpractice

fun main(args: Array<String>){
    val firstPerson = Person("John", 20, "Programmer")
    val secondPerson = Person("Dave", 30, "Bus Driver")

    val olderPerson = if (firstPerson.age >= secondPerson.age) firstPerson else secondPerson
    olderPerson.printPerson()

    run {
        if (firstPerson.age >= secondPerson.age) firstPerson else secondPerson
    }.printPerson()

    with(firstPerson) {
        age += 1
        "Age is now $age"
    }.println()

    firstPerson.run {
        age += 1
        "Age is now $age"
    }.println()

    firstPerson.let { modifiedPerson ->
        modifiedPerson.age += 1
        "Age is now ${modifiedPerson.age}"
    }.println()

    secondPerson.apply {
        age += 1
        job = "Hot-dog seller"
    }.printPerson()

    secondPerson.also {
        it.age += 1
        it.job = "YouTuber"
    }.printPerson()
}

data class Person(var name: String,
                  var age: Int,
                  var job: String) {
    fun printPerson() = println(this.toString())
}

fun String.println() = println(this)