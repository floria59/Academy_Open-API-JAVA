package sec05.stream_mapping;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AsDoubleStreamAndBoxedExample {

	public static void main(String[] args) {
		int[] intArray = {1, 2, 3, 4, 5 };
		
		IntStream intStream = Arrays.stream(intArray);
		
		intStream
			.asDoubleStream()  // 1.0, 2.0, 3.0, 4.0, 5.0
			.forEach(d -> System.out.println(d));
		
		System.out.println();
		
		
		//형변환 개념
		//Boxing : 기본데이타타입의 값을 참조타입의 힙영역에 메모리생성하여, 관리하는 기술.  참고>UnBoxing
		intStream = Arrays.stream(intArray);
		intStream
			.boxed() // Boxing형변환(힙영역으로 관리됨)
			.forEach(obj -> System.out.println(obj.intValue()));
		
		
		
		

	}

}
