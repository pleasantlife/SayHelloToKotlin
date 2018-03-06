package com.gandan.android.kotlinbasicpractice

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.gandan.android.kotlinbasicpractice.Model.Person


class MainActivity : AppCompatActivity() // Java : class MainActivity extends AppCompatActivity
{
    //var : 수정이 가능한 변수, val : 수정이 불가능한 변수(=final)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //new 키워드를 사용하지 않고 클래스를 생성한다!
        var person : Person = Person("Peter", 13)

    }

}
