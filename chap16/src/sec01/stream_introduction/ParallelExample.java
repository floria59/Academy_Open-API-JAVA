package sec01.stream_introduction;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelExample {

	public static void main(String[] args) {
		//스트림 병렬처리방식을 확인하는 예제 
		List<String> list = Arrays.asList("홍길동", "신용권", "감자바", "람다식", "박병렬");
		
		//순차처리
		Stream<String> stream = list.stream();
		// Consumer함수적인터페이스가 매개변수는 제공하고 리턴이 없으므로, 매개변수를 제공하고, print(매개변수) 로 되어있으면, 
		// 메소드참조구문에서는 매개변수 생략가능
		stream.forEach( ParallelExample :: print); 
	
		
		System.out.println();
		
		//병렬처리 : 내부적으로 제공하는 멀티스레드로 동작함.
		Stream<String> parallelStream = list.parallelStream();
		parallelStream.forEach(ParallelExample :: print);
		

	}
	
	
	
	public static void print(String str) {
		// Thread.currentThread().getName() 현재 실행스레드의 이름확인
		System.out.println(str + " : " + Thread.currentThread().getName());
	}

}
