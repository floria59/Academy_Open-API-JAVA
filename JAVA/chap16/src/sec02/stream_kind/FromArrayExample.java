package sec02.stream_kind;

import java.util.Arrays;
import java.util.stream.Stream;

public class FromArrayExample {

	public static void main(String[] args) {
		// 배열로부터 스트림 참조
		String[] strArray = {"홍길동", "신용권", "김미나"};
		
		Stream<String> strStream = Arrays.stream(strArray);
		strStream.forEach(str -> System.out.print(str + ","));
		

	}
	
	//메소드는 매개변수 유무, 리턴값유무에 따라 4가지 형태가 존재.
	// 이 메소드는 위의 Consumer 함수적인터페이스 를 람다식으로 참조하기위한 구문.
	// 람다식문법이 지원이 안될경우에는 아래와 같은 메소드로 작업을 처리해야 한다.
	public static void methodA(String str) {
		System.out.println(str);
	}
	
	public static void methodB() {
		System.out.println();
	}
	
	public static int methodA(int a, int b) {
		return a + b;
	}
	
	public static int methodA() {
		return 0;
	}

}
