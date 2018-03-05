package com.gandan.android.kotlinbasicpractice.Model

/**
 * Created by XPS on 2018-03-05.
 */
//기본생성자의 인자가 있는 경우!
class Car(price:Int) {
    //여기서의 this는 자바에서 멤버 변수를 참조할 때 쓰는 this와는 다르다!
    constructor(price:Int, name:String, power:Int):this(price)
}