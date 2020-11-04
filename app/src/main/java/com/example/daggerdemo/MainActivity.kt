package com.example.daggerdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

//constructor injection
//providing @Inject keyword, we ask dagger to provide both engine and wheel
//if we miss, @Inject in three classes, then code wont compile.
//this s constructor injection,. it is pretty simple
//but in all cases, constructor injection is not possible.
class MainActivity : AppCompatActivity() {
    //constructor injection declaration
    lateinit private var myCar:Car

    /*
    For field injection declaration
    lateinit @Inject private var myCar:Car
    lateinit @Inject var myCar:Car

     */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //injection by Component class
        //
        //val component:CarComponent=DaggerCarComponent.create()
       //myCar=component.getCar()
        //


        /*
        Field injection or Member injection

        //lateinit @Inject private var myCar:Car
        if i use above, i can see that dagger does not support injection into private fields
        after removing private , i have to write below code

        I am asking component to inject this class fields, by calling inject methods with this class object
         */
        val component:CarComponent=DaggerCarComponent.create()
        component.inject(this)

              myCar.drive()


        /*
        so far, 2 ways

         */
    }
}