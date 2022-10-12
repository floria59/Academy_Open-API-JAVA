package sec03.stream_pipelines;

import java.util.Arrays;
import java.util.List;

public class StreamPipelinesExample {

	public static void main(String[] args) {
		//1)소스(데이터)
		List<Member> list = Arrays.asList(
			new Member("홍길동", Member.MALE, 30),	
			new Member("김나리", Member.FEMALE, 20),
			new Member("신용권", Member.MALE, 45),
			new Member("박수미", Member.FEMALE, 27)
		);
		
		int sumAge = 0;
		int count = 0;
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getSex() == Member.MALE) {
				count++;
				sumAge += list.get(i).getAge();
			}
		}
		
		System.out.println("평균 남자 나이: " + (sumAge / (double)count));
		
		
		
		//성별이 남자인 데이타에 한하여 나이평균?
		//2)스트림생성->중간처리->최종처리(결과)
		double average = list.stream()  // 4개 Member객체를 참조
		.filter(m -> m.getSex() == Member.MALE)  // 남자인 2개의 Member객체를 참조.  Predicate함수적인터페이스.(매개변수 있고, 리턴값이 boolean. 매개변수를 이용한 조건식)
		.mapToInt(m -> m.getAge())  //나이를 매핑한 중간처리. ToIntFunction함수적 인터페이스.(매개변수 있고, 리턴값이 매개변수를 이용한 매핑작업)
		.average()
		.getAsDouble();
		
		System.out.println("남자 평균이 나이: " + average); // 2
		

	}

}
