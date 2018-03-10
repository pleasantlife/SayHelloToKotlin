# 코틀린 클래스

## 1. 클래스 생성 및 사용
 - 클래스 생성은 자바와 거의 동일하다.
 - 단, 클래스 생성 시 'new' 키워드를 사용하지 않는다.
```Java

//클래스 생성

public class Person {
    //TODO
}

//클래스 사용

public class WorldActivity extends Activity {
    Person person = new Person();

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        //TODO
    }
}
```
```kotlin
// 클래스 생성

class Person {
 // TODO
}

//클래스 사용

class WorldActivity : Activity(){
    override fun onCreate(savedInstanceState:Bundle){
        var person:Person = Person()
    }
}
```

## 2. 생성자
- 코틀린은 클래스 선언부에서 constructor 키워드를 사용하여 생성자를 만들어준다.
```java
public class Person {
  public Person(String name, int age){

  }
  ......
}
```
```kotlin
class Person constructor(name:String, age:Int)
```
- 단, 'constructor' 키워드는 생략할 수 있다.
```kotlin
class Person(name:String, age:Int){
  //TODO
}
```
 - 클래스에서 생성자를 여러개 선언해야 하는 경우
```java
//기본 생성자의 인자가 없는 경우
public class Person {

  public Person() {

  }

  public Person(String name, int age){

  }
  .......
}

//기본 생성자의 인자가 있는 경우
public class Person {

  public Person(String name){

  }

  public Person(String name, int age){

  }
}
```
```kotlin
//기본 생성자의 인자가 없는 경우
class Person {

  constructor(name:String, age:Int):this()
}

//기본 생성자의 인자가 있는 경우
class Person{

  constructor(name:String, age:Int):this(name)
}
```

## 3. 데이터 클래스
- 코틀린에는 데이터의 그릇이 되는 데이터 클래스를 별도로 제공하여 이를 이용해서 데이터 클래스를 생성하는 것이 가능하다.
```java
public class Person(){

  private String name;
  private int age;
}
```
```kotlin
data class Person(var name: String, var age: Int)
```
- 코틀린에서 get/set을 사용하지 않고, 직접 접근하여 사용한다.
```kotlin
val person : Person = Person("이름", 16)
val personName: String = person.name
val personAge: int = person.age
```
- 데이터 클래스는 최소 한 개의 값을 생성자에 추가해주어야 한다.