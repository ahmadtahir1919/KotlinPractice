package com.example.kotlinpractice.models

 data class SampleModel(var integerValue:Int=1,var stringValue:String,var varstringValue2:String) {

   init {
       integerValue=3

       stringValue="\n".plus(stringValue).plus(" 1")
    }
     init {
         integerValue=3

         stringValue="\n".plus(stringValue).plus(" 2")
     }
     init {
         integerValue=3

         stringValue="\n".plus(stringValue).plus(" 3")
     }// init functions are called sequenolay
     //init
    fun getStringWithConcat(andotherName:String):String{
        return stringValue.plus(andotherName)
    }
}