package com.gandan.android.kotlinbasicpractice.Model

import android.util.Log

/**
 * Created by XPS on 2018-05-22.
 */
//생성자를 만드는 또 다른 방법은, 괄호안에 넣어버리는 것!
open class Sedan(price: Int, horsePower: Int) : Car(5, "세단", 4) {

    var carPrice = price
    var power = horsePower





}