package com.gandan.android.kotlinbasicpractice

import com.gandan.android.kotlinbasicpractice.Model.Car

//제네릭 인스턴스의 생성 및 사용
interface Container<T : Car> {

    fun put(item: T)

    fun ride() : T
}