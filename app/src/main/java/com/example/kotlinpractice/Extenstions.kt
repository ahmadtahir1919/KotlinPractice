package com.example.kotlinpractice

fun main() {

    myLoop@  for (i in 1..3) {
        myLoo2p@  for (j in 1..3) {
           for (k in 1..3){
                println("i = $i  j = $j")
                if (k==2){
                    break@myLoop
                }
            }

        }
    }


    //extenstionFunctions()
    //listItrator()
    //listSum()
    //tripleValue()
    //pairs()
    //list2()
    //  triple()
    // toList()
}

private fun extenstionFunctions() {
    fun String.hasSpaces() {
        find { it == ' ' } != null
    }
    println("Does it have spaces?".hasSpaces())

    fun String.hasSpaced() = find { it == ' ' } != null


    println("Ahmadhasespace".hasSpaced())
}

private fun listItrator() {
    val list2 = listOf("a", "bbb", "cc")
    for (s in list2.listIterator()) {
        println("$s ")
    }
}

private fun listSum() {
    val list = listOf<String>("A", "bcd")
    println(list.sumBy { it.length })
}

private fun tripleValue() {
    //Destructure a triple and print the values.
    val numbers = Triple(6, 9, 42)
    val (n1, n2, n3) = numbers
    println("$n1 $n2 $n3")
}

private fun pairs() {
    //Destructure some pairs and triples
    val equiment = "fish net" to "catching fish"
    val (tool, use) = equiment
    println("$tool is used for $use")
}

private fun list2() {
    val equipment = ("fish net" to "catching fish") to "Ahmad"
    println("${equipment.first} used for ${equipment.second}")
}

private fun triple() {
    val number = Triple("1", "2", "3")
    println("number.first = ${number.first} Second = ${number.second} Third = ${number.third}")
    println("To List is ${number.toList()}")
    println("number is ${number}")
}

private fun toList() {
    val equipment = "fish net" to "catching fish" to "Ahmad" to "Tahir" to "Nabeel"
    println("${equipment.first} used for ${equipment.second}")
}