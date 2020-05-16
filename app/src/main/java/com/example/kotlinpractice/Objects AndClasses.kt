package com.example.kotlinpractice

import com.example.kotlinpractice.models.Aquarium
import com.example.kotlinpractice.models.TowerTank

fun main() {
   // buildAquarium()
    buildAquarium2()
    
}
fun buildAquarium() {
    val aquarium6 = Aquarium(length = 25, width = 25, height = 40)
    aquarium6.printSize()
}
fun buildAquarium2() {
    val myAquarium = Aquarium(width = 25, length = 25, height = 40)
    myAquarium.printSize()
    val myTower = TowerTank(diameter = 25, height = 40)
    myTower.printSize()
}