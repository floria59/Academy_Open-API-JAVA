package sec04.stream_filtering;

import java.util.Arrays;
import java.util.List;

public class FilteringExample {

	public static void main(String[] args) {
		//1)데이터 소스
		List<String> names = Arrays.asList("홍길동", "신용권", "감자바", "신용권", "신민철");
		
		//2)스트림생성
		names.stream()
			.distinct() // "홍길동", "신용권", "감자바", "신민철"  ->신용권 중복처리됨.
			.forEach(n -> System.out.println(n));
		
		System.out.println();
		
		names.stream()
			.filter(n -> n.startsWith("신")) // "신" 으로 시작하는 문자열 필터링.  "신용권", "신용권", "신민철"
			.forEach(n -> System.out.println(n));
		
		System.out.println();
		
		names.stream()
		.distinct()
		.filter(n -> n.startsWith("신"))
		.forEach(n -> System.out.println(n));

	}

}
