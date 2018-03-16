# 코틀린 함수

## 1. 코틀린의 함수 기본 타입
- 코를린의 함수 형태
```kotlin
fun 함수명(변수명 : 변수 타입) : 리턴 타입 { 로직과 리턴 값 }
```

- 생성 예시
```kotlin
fun hello(world : String): String {
    return world + "Every One!"
}
```

- 단순화
```kotlin
fun hello(world : String): String = world + "Every One"
```

- 자바와 비교
```java
public String hello(String world){
    return world + "Every One!";
}
```

- 함수에 기본값 '='을 사용하면 default가 자동으로 사용되게 된다.
```kotlin
fun hello(word: String = "!!!");
```

## 2. 고차함수(High-Order Functions)
- 고차함수는 함수를 변수로 넘겨주거나, 이를 변환하는 것을 말한다.
```kotlin
//코틀린 레퍼런스 문서 참고
fun <T> lock(lock: Lock, body () -> T): T {
    lock.lock()
    try {
        return body()
    }
    finally {
        lock.unlock()
    }
}

fun toBeSynchronized() = sharedResource.operation()
val result = lock(lock, ::toBeSynchronized)
```
- 코드 해석
 1) body : 파라미터명
 2) () -> T : ()는 파라미터가 없는 메서드를 정의, -> T는 리턴 타입을 정의
 3) :: : 함수를 직접 가리킴.

- 고차함수에서의 파라미터 정의
 1) 파라미터가 없을 경우 : 람다 식에서는 마지막 줄이 리턴
 ```kotlin
 fun print(body:() -> String){
     println(body())
 }

 @Test
 fun test(){
     print({
         "Hello World!"
     })
 }
 ```

