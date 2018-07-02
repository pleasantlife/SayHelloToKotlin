package com.gandan.android.kotlinbasicpractice

import android.graphics.Color
import android.graphics.Typeface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.widget.TextView
import com.gandan.android.kotlinbasicpractice.Adapter.TestAdapter
import com.gandan.android.kotlinbasicpractice.Model.Car
import com.gandan.android.kotlinbasicpractice.Model.Garage
import com.gandan.android.kotlinbasicpractice.Model.Person
import com.gandan.android.kotlinbasicpractice.Model.RRPhantom
import kotlinx.android.synthetic.main.activity_main.*

//Java에서 static에 해당되는 const는 패키지 단위로 선언해야 하기에, 클래스와 import 패키지문 사이에 적는다.
const val TWENTY_EIGHT= 28f

object Singleton

class MainActivity : AppCompatActivity() // Java : class MainActivity extends AppCompatActivity
{

    //var : 수정이 가능한 변수, val : 수정이 불가능한 변수(=final)

    //lateinit으로 선언한 변수에 값을 지정하는 것을 '선언 시점'이 아닌 '원하는 상황'으로 유예할 수 있다.
    lateinit var phantom : RRPhantom

    //lateinit은 val로 선언이 불가능하다. (final 선언 불가)
    // lateinit val hello : String -> 오류 발생

    //단 lateinit은 primitive type(int 등)은 지원하지 않는다.
    //lateinit var hello : Int -> 오류 발생

    var hello : Int? = null

    //val : Java의 final과 동일한 역할을 하는 변수 선언
    val welcome : Int = 16

    // by lazy로 val의 lateinit 구현
    // var에서는 by lazy 사용 불가.
    val hi : Person by lazy {
        Person("Kotlin", 3)
    }

    //코틀린에서는 배열은 타입 인자를 갖는 Array클래스로 표현한다.
    var carArray : Array<String> = arrayOf("Phantom", "Range Rover", "Maybach", "McLaren")

    lateinit var carList : ArrayList<Car>

    //Primitive type은 코틀린 배열 클래스의 타입 인자로 사용할 수 없다.
    //var intArray : IntArray = arrayOf(0,1,2,3,4,5) <- 에러 발생
    var intArray : IntArray = intArrayOf(0,1,2,3,4,5)
    var floatArray : Array<Float> = arrayOf(0.1f, 0.2f, 0.3f, 0.4f, 0.5f)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //new 키워드를 사용하지 않고 클래스를 생성한다!
        var person : Person = Person("Peter", 13)
        var txtTest = findViewById<TextView>(R.id.txtTest)
        txtTest.apply {
            text = "hello"
            textSize = TWENTY_EIGHT
            typeface = Typeface.DEFAULT_BOLD
            setTextColor(Color.parseColor("#000000"))
        }

        //lateInit이 초기화 되었는지 아닌지 여부를 판단할 수 있다.(코틀린 1.2버전부터 적용)
        if(!::phantom.isInitialized) {
            phantom = RRPhantom()
        }

        var testAdapter = TestAdapter(this@MainActivity, carList)

        //with를 이용해 변수가 포함하고 있는 속성을 정의해줄 수 있다.
        with(recyclerView){
            //초기화 여부 확인하여 초기화가 되어있으면 어댑터를 연결함.
            if(::carList.isInitialized)
            adapter = testAdapter
            layoutManager = LinearLayoutManager(this@MainActivity)
        }

        //let을 쓰면 testAdapter를 블록의 인자(it)으로 넘기고, 그 인자의 마지막 결과값을 반환한다.
        //값이 있는 경우, 추가로 코드를 수행.
        testAdapter.let { it.notifyDataSetChanged() }

        //apply는 결과값 자체를 반환한다.
        testAdapter.apply { notifyDataSetChanged()  }

        //let과 with의 합성.
        testAdapter.run { notifyDataSetChanged() }







        // val은 final이기 때문에, 값 변경 불가.
        // welcome = 279

       /* txtTest.text = "Hello"
        txtTest.textSize = 28f
        txtTest.typeface = Typeface.DEFAULT_BOLD
        txtTest.setTextColor(Color.parseColor("#000000"))*/
        var color = txtTest.textColors
        Log.e("getText", txtTest.text.toString()+"")
        Log.e("color", color.toString()+"");
        var recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        //recyclerView.adapter = adapter
        with(recyclerView){
            layoutManager = LinearLayoutManager(this@MainActivity)
        }

        var door = Garage().ride().seatCount
        Log.e("door", door.toString()+"")

        when(door){
            4 -> Log.e("세단", "${door}도어")
            5 -> Log.e("SUV", "${door}도어")
            else -> Log.e("문 수", door.toString())
        }

        //위에서 선언한 phantom에 값을 넣어줌.
        phantom = RRPhantom()
        phantom.logPrice()

        //코틀린에서의 캐스팅은 as 연산자를 사용한다.
        //단, 자료형 추론이 가능할 경우에는 별도로 캐스팅을 하지 않아도 알아서 캐스팅 해주는 '스마트 캐스트'를 지원한다.
        var doorString = door as String


        //코틀린에서는 for문 내에서 현재 항목의 인덱스가 필요할 경우, Collection.indicies를 사용하여 항목에 접근 가능.
        if(::carList.isInitialized){
            for(i in carList.indices){
                Log.e("carList[i]", carList[i].name)
            }
        }
    }

}


