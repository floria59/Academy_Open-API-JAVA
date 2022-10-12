package sec07.stream_looping;

import java.util.Arrays;

public class LoopingExample {

	public static void main(String[] args) {
		int[] intArr = { 1, 2, 3, 4, 5 };
		
		System.out.println("[peek()를 마지막에 호출한 경우]");
		Arrays.stream(intArr)
			.filter(a -> a % 2 == 0) // 2, 4
			.peek(n -> System.out.println(n)); //코드가 실행되지 않음(지연기능)
		
		System.out.println("[최종 처리 메소드를 마지막에 호출한 경우]");
		int total = Arrays.stream(intArr)
				.filter(a -> a%2 == 0) // 2, 4
				.peek(n -> System.out.println(n)) //코드가 실행됨.(지연기능)
				.sum();
		
		System.out.println("총합: " + total);
		
		System.out.println("[forEach()를 마지막에 호출한 경우]");
		Arrays.stream(intArr)
			.filter(a -> a%2==0)
			.forEach(n -> System.out.println(n)); //동작 
				

	}

}
