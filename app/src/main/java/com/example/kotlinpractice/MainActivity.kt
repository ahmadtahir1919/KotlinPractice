package com.example.kotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinpractice.models.Aquarium
import com.example.kotlinpractice.models.SampleModel
import com.example.kotlinpractice.models.DataClassOfPrimaryConstaructor
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.reflect.Array

class MainActivity : AppCompatActivity() {
    data class Person1(var name: String, var age: Int)
    class Person2(var name: String, var age: Int)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // switchStatments(8)
        // checkNullAbility()
       // arraysOfList()
        buildAquarium()
        //modelWithDefaultValue()
        //test1()
        // test2()
        // var dataClassOfPrimaryConstaructor = dataClassOfPrimaryConstaructor()

        // var dataClassOfPrimaryConstaructor2 = copyConstructor()
        // var dataClassOfPrimaryConstaructor = dataClassOfPrimaryConstaructor()
        /*    val dataClassOfPrimaryConstaructor1 = DataClassOfPrimaryConstaructor("copy value")
            val dataClassOfPrimaryConstaructor12 =
                dataClassOfPrimaryConstaructor1.copy(varstringValue2 = "copy cunstructor")
            println(dataClassOfPrimaryConstaructor)
            showToast("cunstructor 1 ${dataClassOfPrimaryConstaructor12.varstringValue2}")
    */
        // copyConstructor()

        //showToast(copyConstructor().varstringValue2)
        // println(dataClassOfPrimaryConstaructor)
        // showToast("cunstructor 1 ${dataClassOfPrimaryConstaructor.stringValue}")


        //  fun copy(name: String = "") = DataClassOfPrimaryConstaructor(name)

        //  Any changes made to cloned object will be reflected in original object or vice versa.	Any changes made to cloned object will not be reflected in original object or vice versa.

        //showToast("copy cunstructor 2 ${dataClassOfPrimaryConstaructor.copy(stringValue = " value in copy").stringValue}")
        // showToast("copy cunstructor 2 ${copy("Ahmad").varstringValue2}")


        // showToast(dataClassOfPrimaryConstaructor2.varstringValue2)
        // showToast("get value ".plus(dataClassOfPrimaryConstaructor.varstringValue22))
        //Empty Constroctor
        var dataClassOfPrimaryConstaructor23 = DataClassOfPrimaryConstaructor()
    }

    private fun copyConstructor(): DataClassOfPrimaryConstaructor {
        var dataClassOfPrimaryConstaructor = dataClassOfPrimaryConstaructor()
        val dataClassOfPrimaryConstaructor1 = DataClassOfPrimaryConstaructor("copy value")
        val dataClassOfPrimaryConstaructor12 =
            dataClassOfPrimaryConstaructor1.copy(varstringValue2 = "copy cunstructor")
        println(dataClassOfPrimaryConstaructor)
        showToast("cunstructor 1 ${dataClassOfPrimaryConstaructor12.varstringValue2}")
        return dataClassOfPrimaryConstaructor
    }

    private fun dataClassOfPrimaryConstaructor(): DataClassOfPrimaryConstaructor {
        var dataClassOfPrimaryConstaructor = DataClassOfPrimaryConstaructor("2nd contructor called")
        dataClassOfPrimaryConstaructor.varstringValue22 = "value is set"
        // showToast(dataClassOfPrimaryConstaructor.varstringValue22)

        var dataClassOfPrimaryConstaructor2 = DataClassOfPrimaryConstaructor(
            stringValue = "1st contructor called",
            integerValue = 2,
            varstringValue2 = "1st called"
        )
        return dataClassOfPrimaryConstaructor
    }

    fun test1() {
        val alice1 = Person1("Alice", 22)
        val alice2 = Person1("Alice", 22)
        val bob = Person1("bob", 23)

        // alice1 and alice2 are structurally equal, so this returns true.
        println(alice1 == alice2)   // true

        // alice1 and bob are NOT structurally equal, so this returns false.
        println(alice1 == bob)      // false

        // the toString method for data classes are generated for you.
        println(alice1)     // Person1(name=Alice, age=22)
    }

    fun test2() {
        val alice1 = Person2("Alice", 22)
        val alice2 = Person2("Alice", 22)
        val bob = Person2("bob", 23)

        // even though alice1 and alice2 are structurally equal, this returns false.
        println(alice1 == alice2) // false
        println(alice1 == bob)    // false

        // the toString method for normal classes are NOT generated for you.
        println(alice1)  // Person2@1ed6993a
    }

    private fun modelWithDefaultValue() {
        var sampleModel = SampleModel(stringValue = "Ahmad", varstringValue2 = "Ahmad")
        var sampleModel2 = SampleModel(stringValue = "Ahmad", varstringValue2 = "Ahmad")
        if (sampleModel == sampleModel2) {
            showToast("Value is equal")
        } else {
            showToast("Value is not equal")

        }
        txt_hello.setText(sampleModel.getStringWithConcat(" Tahir"))
    }
    //Important Link:- https://stackoverflow.com/questions/45069337/data-classes-in-kotlin

    fun switchStatments(value: Int): Unit {

        when (value) {
            0 -> showToast("value is ${value}")
            in 1..3 -> showToast("value is ${value}")
            else -> showToast("value is ${value}")
        }


    }

    fun checkNullAbility() {
        // var abc:String?=null

        var value: Int = 1
        // value=null
        // var marbles: Int? = 5
        // var marbles: Int? = null
        //showToast(marbles.toString())
///////////////////////////////////////////
        var random: Int = 5
        // showToast(random?.dec().toString())
        //////////////
        var fishFoodTreats = 6

        fishFoodTreats = fishFoodTreats?.dec() ?: 0
        showToast(fishFoodTreats.toString())

        ////////////////////
        var s: String = ""
        val len = s!!.length

    }

    fun arraysOfList() {
        var school = listOf("A", "B", "C")
        //showToast(school.first())
        //showToast(school.last())
       // showToast(school?.listIterator()?.previous()?.toString())
        /////////////////////////////////////////////////////////////////
       // var changeAbleList= mutableListOf("A","B","C")
       // changeAbleList.remove("A")
       // showToast(changeAbleList.toString())
        ///////////////////////////////////////////
       // var mixArray= arrayListOf("1",2,"a",5)
      //  showToast(mixArray.toString())
        ///////////////////////////////////////
    /*    val numbers = listOf(1,2,3)
        val numbers3 = listOf(4,5,6)
        val foo2 = numbers + numbers3
        showToast(foo2[5].toString())*/
        ///////////////////////////////////////////////
        //List within List
        /*val numbers = intArrayOf(1, 2, 3)
        val oceans = listOf("Atlantic", "Pacific")
        val oddList = listOf(numbers, oceans, "salmon")
        showToast(oddList.toString())*/
        /////////////////////////////////
       /* val listofValues= Array(5){it*2}
        showToast(java.util.Arrays.toString(listofValues))*/
        //////////////////////////////////////
      /*  var list= listOf("A","B","C")
        for (value in list){
            showToast(value.toString())

        }
        repeat(2){
            showToast("repeate")
        }*/
        //////////////////////////////////
     /*   var list= listOf("A","B","C")
        for ((index, element) in list.withIndex()) {
            println("Item at $index is $element\n")
        }
        for ((indexis,elementis)in list.withIndex()){
            showToast("Item at $indexis is $elementis")
        }*/
//////////////////////
        /*for (i in 1..5)
            showToast(i.toString())*/
        ///////////////////////
     /*   var bubbles = 0
        while (bubbles < 50) {
            bubbles++
        }
        showToast("$bubbles bubbles in the water\n")

        do {
            bubbles--
        } while (bubbles > 50)
        showToast("$bubbles bubbles in the water\n")

        repeat(2) {
            showToast("A fish is swimming")
        }*/

    /*    val school1 = arrayOf("shark", "salmon", "minnow")

         var school2 = arrayOf("shark", "salmon", "minnow")

        val school3 = listOf("shark", "salmon", "minnow")

        val school4 = mutableListOf("shark", "salmon", "minnow")*/
    }
    fun buildAquarium() {
        val aquarium6 = Aquarium(length = 25, width = 25, height = 40)
        aquarium6.printSize()
    }
}
