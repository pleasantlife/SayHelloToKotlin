package com.gandan.android.kotlinbasicpractice.Model

import android.util.Log
import com.gandan.android.kotlinbasicpractice.Container

class Garage : Container<Car> {
    override fun put(item: Car) {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        Log.e("item", item.toString()+"")
    }

    override fun ride(): Car {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return Car(5, "Raptor", 5)
    }
}