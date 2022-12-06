package com.example.androidlab.test1

import java.text.SimpleDateFormat
import java.util.Date

// 클래스 밖의 변수, 함수를 선언이 가능하고,
// 코틀린 컴파일러에 의해 자바바이트 코드가 생성이 된다.
// 이떄, 변수, 함수는 userkt.class 파일안에 삽입된다.

var data = 10   //문장마다 ;(세미콜론) 사용 안한다.

/*
 코틀린 함수
 fun 함수명 (변수: 데이터타입) : 리턴타입 {

  return 데이터타입
 }
 */


fun formatDate(date: Date): String {
    var sdformat = SimpleDateFormat("yyyy-dd-mm")
    return sdformat.format(date)
}

//클래스 선언
class User{
    var name = "hello"

    //리턴타입 생략 할 수 있다
    fun sayHello(){

    }
}



