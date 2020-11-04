package com.example.daggerdemo

import dagger.Component

@Component
interface CarComponent {
   //fun getCar():Car

   //for field injection i have to right below code. method name is not a matter
   fun inject(mainActivity: MainActivity)
}