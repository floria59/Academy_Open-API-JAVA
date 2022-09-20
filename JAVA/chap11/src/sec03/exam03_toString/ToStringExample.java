package sec03.exam03_toString;

import java.util.Date;

public class ToStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj1 = new Object();
		Date obj2 = new Date();
		// 객체를 출력으로 사용하는 구문은 toString()메서드를 생략해도 내부적으로 호출됨.
		System.out.println(obj1.toString()); // java.lang.Object@15db9742
		System.out.println(obj2.toString()); // Tue Sep 20 12:59:03 KST 2022. toString() 재정의 된 것임.

	}

}
