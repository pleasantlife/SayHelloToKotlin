package com.gandan.android.kotlinbasicpractice.Model

import android.util.Log

/**
 * Created by XPS on 2018-05-22.
 */

//상속받은 클래스의 활용 예시.
class RRPhantom : Sedan(600000000, 600){

    //carPrice와 power는 Sedan 클래스에 있던 것!
    private var phantomPrice = this.carPrice
    private var horsePower = this.power

    fun logPrice(){
        Log.e("price", String.format("%,d", phantomPrice)+"만원")
        Log.e("power", horsePower.toString()+"마력")
    }
}