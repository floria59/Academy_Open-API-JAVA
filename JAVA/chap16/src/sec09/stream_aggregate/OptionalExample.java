package sec09.stream_aggregate;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(); // 값이 존재하지 않은 상태.
		
		// 데이터 작업 유무에 따라서 예제 결과 다름.
		list.add(90);
		list.add(60);
		list.add(70);
		
		
		System.out.println("데이터 개수 : " + list.size());
		
		/* 컬렉션에 값이 존재하지 않을 경우 예외발생.  java.util.NoSuchElementException: No value present
		double avg = list.stream()
				.mapToInt(Integer :: intValue)
				.average()
				.getAsDouble();
		*/
		
		//방법1
		OptionalDouble optional = list.stream()
			.mapToInt(Integer :: intValue) //정수형 데이타로 변환하여 작업
			.average();
		
		// 값이 저장되어 있으면
		if(optional.isPresent()) {
			System.out.println("평균: " + optional.getAsDouble());
		}else {
			System.out.println("평균: 0.0");
		}
		
		//방법2
		double avg = list.stream()
						.mapToInt(Integer :: intValue)
						.average()
						.orElse(0.0);
		System.out.println("평균: " + avg);
		
		//방법3
		list.stream()
			.mapToInt(Integer :: intValue)
			.average()
			.ifPresent(a -> System.out.println("평균" + a)); // 값이 저장되어 있지않으면 이 코드는 실행안됨.

	}

}
