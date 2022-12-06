package com.example.androidlab.test2.sub1

// 데이터 타입

// 코틀린의 모든변수는 객체이다.
// 즉 자바의 기본데이터 타입에 해당하는 변수의 의미가 아니다. (중요)
// 변수선언
// var data1 : Int = 10 이때 Int데이터 타입은 클래스의미라고 보면된다. 자바의 Integer의미로 봐야한다.

// 자바문법
// int a = null; 불가능
// Integer a = null; 가능

fun someFun() {
    var data1 : Int = 10 // null 대입불가능
    var data2 : Int? = null // null 대입가능

    data1 = data1 + 10
    data1 = data1.plus(10) // 객체에서 제공하는 메서드 사용

    data2.plus(10) // 자바에서는 런타임시 예외발생. 코틀린에서는 컴파일타입에서 오류발생
}