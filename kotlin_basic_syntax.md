# 코틀린 기본문법

## 1. 변수
 1) var
  - 수정이 가능한 변수
  - 항상 변수형을 선언해 주어야 한다.
```kotlin
    var name:String //null값을 허용하지 않음.
    var name:String? //null값을 허용함.
```
 2) val
  - 수정이 불가능한 변수
  - var이나 val을 쓰지 않으면 기본적으로 val로 인식한다.
  - 자바의 final과 같은 역할을 하는 변수
  - 변수 타입을 쓰지 않아도 어떤 인자가 대입되는지를 자동으로 파악하여 타입이 정해진다.(스마트 타입 캐스팅)
  - 하지만, 변수 타입을 써주어도 동작한다.

## 2. null
 - 코틀린의 기본 변수는 null을 가질 수 없으며 물음표를 추가했을 때에만 null을 명시할 수 있다.
```kotlin
//오류가 발생하는 경우
var age : Int = 36
age = null

//오류가 발생하지 않는 경우
var money: Int? = null
money = null  
```
- 느낌표 두개를 써서 nullable이면 오류가 발생하도록(==@NotNull) 할 수도 있다.

## 2. 코틀린에서의 'Any'
- Any는 Java에서 Object에 해당한다.
- 코틀린에서는 Any 키워드를 통해 type을 지정할 수 있다.
```kotlin
//어떤 타입이 들어갈지 모르기 때문에, null이 될 수 있도록 리턴타입을 Int?로 표시하였다.
fun getStringLength(obj: Any): Int? {
    if(obj is String){
        //String 타입이면 길이를 int 값으로 리턴함.
        return obj.length
    }
    //String 이외의 타입은 null을 리턴함.
    return null
}
```

## 3. for문
- 파이썬과 유사한 형태의 for문을 사용한다.
```kotlin
val arrayList = ArrayList<String>()
for (string in arrayList) {
    Log.d("String", string+"")
}
```

## 4. ranges
- 숫자의 범위를 지정할 떄 시작하는 숫자와 끝나는 숫자 사이에 온점 두개를 찍어 사용하며, if문에서도 사용 가능하다.
```kotlin
for (x in 1..5){
    Log.d("x", x+"")
}
```