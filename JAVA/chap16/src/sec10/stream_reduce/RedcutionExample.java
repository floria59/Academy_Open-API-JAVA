package sec10.stream_reduce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RedcutionExample {

	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("홍길동", 92),
				new Student("신용권", 95),
				new Student("감자바", 88)
		);
		
//		List<Student> studentList = new ArrayList<Student>();
		
		int sum1 = studentList.stream()  //스트림생성
					.mapToInt(Student :: getScore)  //매핑(중간처리)
					.sum(); //최종처리
		
		int sum2 = studentList.stream()
					.map(Student :: getScore)
					.reduce((a, b) -> a+b) // 점수가 누적이 된다.
					.get();
		
		int sum3 = studentList.stream()
					.map(Student :: getScore)
					.reduce(0, (a, b) -> a + b);
		
		System.out.println("sum1: " + sum1);
		System.out.println("sum2: " + sum2);
		System.out.println("sum3: " + sum3);

	}

}

