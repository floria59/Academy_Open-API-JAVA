package com.example.androidlab.test2

// 컬렉션
// List,  Set, Map

// 코틀린은 컬렉션을 mutable(가변) collection vs immutable(불변) collection 으로 분류
//
/*
1)mutable(가변) collection : 자바와 동일.
 특징? 추가, 변경이 가능

2)immutable(불변) collection
 특징? 추가, 변경이 불가능

 */

fun main() {
    // 1) List : immutable(불변) collection
    var list = listOf<Int>(10, 20, 30)
    list.get(0)
    //list.set() 메서드 지원이 안됨

    // 2 ) mutable(가변) collection
    var list2 = mutableListOf<Int>(10, 20, 30)
    list2.get(0)
    list2.set(1, 30)


    //Map
    var map = mapOf<String, String>(Pair("one", "hello"), "two" to "world")

    println(
        """
        map.size : ${map.size}
        map.data : ${map.get("one")}, ${map.get("two")}
        """.trimIndent()
    )
}