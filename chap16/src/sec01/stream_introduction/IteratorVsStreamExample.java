package sec01.stream_introduction;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class IteratorVsStreamExample {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("홍길동", "신용권", "감자바");
		
		/*요소를 순차적으로 접근하는 방법*/
		
		//1)Iterator 이용. 자바7
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}
		
		System.out.println();
		
		//2)스트림 이용. 자바8추가.   컬렉션 또는 배열에서 stream()메소드 이용. 람다식으로 요소처리. 내부반복자를 사용 병렬처리 쉽다.
		
		Stream<String> stream = list.stream();
		//Consumer함수적 인터페이스 : 객체소비목적. 람다식제공.
		// 매개변수는 제공하고, 리턴값이 없다.
		stream.forEach( name -> System.out.println(name));
		
		
	}

}
