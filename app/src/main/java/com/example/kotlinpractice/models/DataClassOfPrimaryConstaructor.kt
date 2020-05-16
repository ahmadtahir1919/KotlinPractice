package com.example.kotlinpractice.models

//data class DataClassOfPrimaryConstaructor (var integerValue:Int, var stringValue:String, var varstringValue2:String) {
data class DataClassOfPrimaryConstaructor constructor(
    var integerValue: Int,
    var stringValue: String,
     var varstringValue2: String
) {
    var age: Int = 0

    var varstringValue22: String="empty"
        get() {
            return field
        }
        set(value) {
        field=value.toUpperCase()
        }

 /*   init {
        this.varstringValue2 = "null value default"

    }*/

    //Must call primary constructor
    constructor(name: String) : this(-2, name, "") {
        this.varstringValue2 = "Contrustor 1 value"
    }
    //Empty Constructor
    // constructor():this(3,"","")

    //This also empty and call constructor(name:String) first and then constructor(name:String) called
    // constructor(var integerValue:Int, var stringValue:String, var varstringValue2:String)
    constructor() : this("")
}