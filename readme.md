# 코틀린을 배워봅시다!

## 1. 코틀린이란?
- 안드로이드 스튜디오와 인텔리J를 만든 '젯브레인'에서 만든 언어.
- 2017년 구글 I/O에서 코틀린을 안드로이드 개발 언어로 채택.
- 자바와 100% 호환되는 언어이며, 크로스 플랫폼을 지원.

## 2. 자바 대비 코틀린이 갖는 장점
- 코드를 더 적게 사용할 수 있다.(사용성 향상)
 1) 예시 : 데이터를 담는 데이터 클래스 생성
```java
    //자바
    public class Data {
        private String stringData;
        private int intData;
        
        public String getStringData(){
            return stringData;
        }
        
        public void setStringData(String stringData){
            this.stringData = stringData;
        }

        public int getIntData(){
            return intData;
        }

        public void setIntData(int intData){
            this.intData = intData;
        }
    }
```
```kotlin
    //코틀린
    data class Data(var stringData:String, var intData:Int)
```
- null point exception에 대한 쉬운 대비 가능
- 함수형 언어의 형태 차용
1) 예시 : onClickListener
```java
    //자바
    Button btn = new Button(this);
    btn.setOnClickListener(new View.OnClickListener(){
        public void onClick(View v){
            //TODO
        }
    });
```
```kotlin
    //코틀린
    val button = Button(this);
    button.setOnClickListener {

    }
```
- 상속 받지 않고도 가능한, 클래스의 확장

## 3. 코틀린 키워드 
 - [코틀린 변수](http://github.com/pleasantlife/SayHelloToKotlin/blob/master/kotlin_variable.md)
 - [코틀린 클래스](http://github.com/pleasantlife/SayHelloToKotlin/blob/master/kotlin_class.md)