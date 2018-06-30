package com.gandan.android.kotlinbasicpractice.Model

import android.util.Log

/**
 * Created by XPS on 2018-03-05.
 */
//기본생성자의 인자가 있는 경우!
//클래스 상속을 가능하게 하기 위해서는 class 앞에 'open'을 붙여야 한다.
open class Car(var seats:Int) {
    //생성자는 이렇게 만듭니다.
    //여기서의 this는 자바에서 멤버 변수를 참조할 때 쓰는 this와는 다르다!

    var seatCount = 0
    lateinit var name : String

    constructor(seats:Int, name:String, doors:Int):this(seats){
        Log.e("seats", seats.toString()+"")
        Log.e("name", name.toString()+"")
        Log.e("doors", doors.toString()+"")
        seatCount = seats
        this.name = name
    }


}