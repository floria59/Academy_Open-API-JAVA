package com.example.androidlab.test2

// 배열 : Array 클래스를 사용

fun main() {
    val data1: Array<Int> = Array(3, { 0 })
    arr1[0] = 10
    arr1[1] = 20
    arr1.set(2, 30)

    println("${arr1.size}, ${arr1[0]}, ${arr1.get(2)}")

    // 타입유추
    val arr2 = arrayOf<Int>(10,20,30)

    //기초 데이터타입에 해당하는 배열클래스
    val arr3 : LongArray= LongArray(3,{0L})
}