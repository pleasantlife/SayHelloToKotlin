# 코를린 키워드 알아보기

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

## 2. 클래스
  [코틀린의 클래스 알아보기](https://github.com/pleasantlife/SayHelloToKotlin/blob/master/kotlin_class.md)

