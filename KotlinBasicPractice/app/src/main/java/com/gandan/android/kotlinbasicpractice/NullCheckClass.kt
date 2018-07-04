package com.gandan.android.kotlinbasicpractice

import android.util.Log
import com.gandan.android.kotlinbasicpractice.Model.Car
import com.gandan.android.kotlinbasicpractice.Model.Sedan

//Kotlin의 null 안정성
class NullCheckClass {

    //변수 선언시 별도 표기가 없으면 null을 허용하지 않는다.
    //null을 허용하게 하려면, 타입 뒤에 명시적으로 '?'를 붙여야 한다.
    val nullString : String? = null

    lateinit var hello : Car

    //null을 허용하지 않는 값 또는 변수에 null 값을 변환할 수 있는 함수의 결과를 대입해야 한다면?
    //엘비스연산자(?:)를 사용하여 처리할 수 있다.

    fun elvis() {
        nullString ?: "none"
        nullString ?: throw IllegalStateException()
        Log.e("nullString", nullString.toString())
    }

    //안전한 호출(?.)로 null check를 java보다 매우 편하게 할 수 있다.
    //hello가 null이 아닐떄에만 hello 객체 내에 있는 driver의 값을 foo가 갖게 된다.
    var foo = hello?.driver

    //자료형 변환(as?)연산자를 통해 받는 값의 자료형으로 변환하거나 null을 허용시킬 수 있다.
    var convert = foo as? Int

    //elvis 연산자와 조합할 수도 있다.
    var convertSuccess = foo as? Int ?: 0
}