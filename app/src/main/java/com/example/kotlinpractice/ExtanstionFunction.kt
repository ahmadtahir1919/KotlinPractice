package com.example.kotlinpractice

import android.app.Activity
import android.widget.Toast

fun Activity.showToast(message:String){
    Toast.makeText(applicationContext,message,Toast.LENGTH_LONG).show()
}
