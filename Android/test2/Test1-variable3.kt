package com.example.androidlab.test2.sub3

// 초기화 미루기 : lateinit, lazy
/*
    변수 선언시 초기값을 할당하지 않고, 변수가 사용하는 시점 이후에 값을 할당할것이라는 것을 컴파일러에게 알려주는 문법
 */

// lateinit 사용
// lateinit var 는 사용가능 , val은 불가능
// Int, Long, Short, Double, Float, Boolean, Byte 타입에는 사용이 불가능하다
lateinit var data1: Int // 오류 : Int는 사용불가능
lateinit val data2: String // 오류 : val은 사용불가능
lateinit var data3: String // 성공 , 기본은 초기값을 할당해야하지만, 컴파일러에게 나중에 사용할 것이라고 공지를 해서, 문제가 안된다.


// lazy
// 코드에서 변수가 최초로 사용되는 순간에 lazy블럭의 값이 초기값으로 사용된다.

val data4: Int by lazy {
    println("in lazy...")
    10
}

fun main(){
    println("in lazy...")
    println(data4 + 10)  // data4의 변수가 최초 사용시 위의 lazy 블럭이 초기화 된다.
    println(data4 + 10)
}