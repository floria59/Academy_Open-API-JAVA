package sec05.stream_mapping;

import java.util.Arrays;
import java.util.List;

import sec01.stream_introduction.Student;

public class MapExample {

	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("홍길동", 10),
				new Student("신용권", 20),
				new Student("유미선", 30)
		);
		
		studentList.stream()
			.mapToInt(Student :: getScore) // int형 요소로 10, 20, 30 IntStream객체. 
			.forEach(score -> System.out.println(score));
			
	}

}
