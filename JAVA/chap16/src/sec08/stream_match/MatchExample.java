package sec08.stream_match;

import java.util.Arrays;

public class MatchExample {

	public static void main(String[] args) {
		int[] intArr = { 2, 4, 6};
		
		//함수적인터페이스 : Consumer, Supplier, Function, Operator, Predicate 
		// 매개변수 유무, 리턴값 유무
		// 추상메소드 1개 이어야 한다. 추상메소드를 람다식문법을 사용하여 구현가능.
		
		boolean result = Arrays.stream(intArr).allMatch(a -> a%2==0);
		
		System.out.println("모두 2의 배수인가? " + result);
		
		result = Arrays.stream(intArr).anyMatch(a -> a%3==0);
		
		System.out.println("하나라도 3의 배수가 있는가? " + result);
		
		result = Arrays.stream(intArr).noneMatch(a -> a%3==0);
		
		System.out.println("3의 배수가 없는가? " + result);
							

	}

}
