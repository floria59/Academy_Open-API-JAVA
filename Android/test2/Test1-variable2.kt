package com.example.androidlab.test2.sub2

// 초기값 할당

val data3 : Int // 초기값 할당을 안했기에 오류가난다.
val data4 = 10

fun someFun(){
    // 함수안에 선언한 변수는 선언과 동시에 초기값을 할당하지 않아도 된다.
    val data5: Int
    print("data5 : $data5" ) // 오류. 왜? 초기값이 할당되지 않아서
    data5 = 10
    print("data5 : $data5" )

}

class User {
    val data6 : Int // 오류
    val data7 : Int = 10
}