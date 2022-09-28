package sec02.exam01_arraylist;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample {

	public static void main(String[] args) {
		// Arrays 클래스 : 배열기능을 지원하는 목적으로 제공.
		List<String> list1 = Arrays.asList("홍길동", "신용관", "감자바");
		//향상된 for문. 배열 또는 컬렉션 사용가능
		for(String name : list1) {
			System.out.println(name);
		}
		
		
		List<Integer> list2 = Arrays.asList(1, 2, 3);
		for(int value : list2) {
			System.out.println(value);
		}

	}

}
