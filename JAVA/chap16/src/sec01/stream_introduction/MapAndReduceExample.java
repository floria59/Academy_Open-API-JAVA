package sec01.stream_introduction;

import java.util.Arrays;
import java.util.List;

public class MapAndReduceExample {

	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("홍길동", 10),
				new Student("신용권", 20),
				new Student("유미선", 30)
		);
		
		int sum = 0;
		for(int i=0; i < studentList.size(); i++) {
			Student stu = studentList.get(i);
			 
			sum += stu.getScore(); //총점
		}
		
		System.out.println(sum / studentList.size()); // 평균
		
		//스트림 이용
		double avg = studentList.stream()
				//중간처리(학생 객체를 점수로 매핑). 점수데이타를 모아둠.
				.mapToInt(stu -> stu.getScore())
				//최종처리(평균점수)
				.average()
				.getAsDouble();
		
		System.out.println("평균점수: " + avg);
		

	}

}
