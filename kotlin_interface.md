# 코틀린 인터페이스

## 1. 기본 형태
- 코틀린의 인터페이스는 기본적으로 자바와 매우 유사하다.
```kotlin
interface ExampleInterface {
    val price : Int
    fun foo()
    fun bar() {
        // 함수 바디
    }
}
```

## 2. 인터페이스 구현
- 인터페이스 구현 역시 자바와 유사하다.
```kotlin
class ExampleClass : ExampleInterface {
    val price : Int = 100
    override fun bar(){
        //구현 코드
    }
    override fun foo(){
        //구현 코드
    }
}
