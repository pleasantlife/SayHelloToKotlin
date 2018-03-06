package com.gandan.android.kotlinbasicpractice.Model

/**
 * Created by XPS on 2018-03-05.
 */

//코틀린은 생성자를 클래스 내부에 만들지 않고, 아래와 같이 만든다.
class Person constructor(var name:String?, age:Int){

    //init{} 함수로 인자값을 처리할 수 있음.
    init {
        if(name.isNullOrBlank()) name = "None"
    }
}
