package sec01.array_collection_compare;

import java.util.ArrayList;

public class ArrayCollectionExample {

	public static void main(String[] args) {
		
		//배열
		//배열선언및생성시 정한 크기를 벗어나면, 예외발생.
		// 데이타타입이 정해져 있으므로, 다른데이타타입은 사용이 불가능. 형변환은 제외하고
		int[] arr = new int[3]; // int형 기억장소 12바이트가 연속적으로 힙영역에 생성
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		arr[1] = 0; // 기억장소를 제거는 불가능하다. 값만 변경할수가 있다.
		
//		arr[3] = 40;
		
		//컬렉션.  JDK에서 많은 클래스로 제공.  java.util패키지 제공
		ArrayList al = new ArrayList(); // 힙영역의 컬렉션 기억장소 생성
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		
		//컬렉션 기억장소의 특징은 데이타를 메모리가 허용되는 한 데이터를 계속 추가할수가 있다. 추가시 메모리 자동생성됨.
		
	}

}
