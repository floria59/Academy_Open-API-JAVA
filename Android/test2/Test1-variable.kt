package com.example.androidlab.test2.sub1

/*
 2일차
 변수와 함수
 */

// 변수선언 키워드 val, var
// 변수선언 기본. val 변수명 : 데이터타입
// 타입유추 : 할당하고자 하는 값의 타입을 보고, 변수의 타입을 지정하는 기능
// 변수선언시 초기값을 할당해야한다 (기본규칙)
val data1: Int = 10 // val data1 = 10   읽기만 가능 / 값 변경 불가능 / 자바의 final과 동일
var data2 = 10                      // 읽기, 쓰기 가능 / 값 변경이 가능

fun myFun() {
//  data1 = 20 // error
    data2 = 20
}