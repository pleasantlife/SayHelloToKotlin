# 코틀린 함수

## 1. 코틀린의 함수 기본 타입
- 코를린의 함수 형태
```kotlin
fun 함수명(변수명 : 변수 타입) : 리턴 타입 { 로직과 리턴 값 }
```

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

- 함수에 기본값 '='을 사용하면 defalut가 자동으로 사용되게 된다.
```kotlin
fun hello(word: String = "!!!");