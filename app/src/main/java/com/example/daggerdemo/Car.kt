package com.example.daggerdemo

import android.util.Log
import javax.inject.Inject

//constructor injection
//providing @Inject keyword, we ask dagger to provide both engine and wheel
//if we miss, @Inject in three classes, then code wont compile.
//this s constructor injection,. it is pretty simple
//but in all cases, constructor injection is not possible.
class Car @Inject constructor(val engine:Engine,val wheel:Wheel) {
//class Car(val engine:Engine,val wheel:Wheel) {
fun drive(){
    Log.e("tag","driving..")
}
}