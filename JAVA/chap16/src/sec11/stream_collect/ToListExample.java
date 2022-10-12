package sec11.stream_collect;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import sec11.stream_collect.Student.Sex;

public class ToListExample {

	public static void main(String[] args) {
		
		// 컬렉션에서 조건에 의한 요소를 필터링하여, 새로운 컬렉션으로 생성하는 예제.
		
		List<Student> totalList = Arrays.asList(
				new Student("홍길동", 10, Sex.MALE),
				new Student("김수애", 6, Sex.FEMALE),
				new Student("신용권", 10, Sex.MALE),
				new Student("박수미", 6, Sex.FEMALE)
		);
		
		//남학생들만 묶어 List생성. new Student("홍길동", 10, Sex.MALE),new Student("신용권", 10, Sex.MALE)
		List<Student> maleList = totalList.stream()
									.filter(s -> s.getSex() == Sex.MALE)
									.collect(Collectors.toList());
		
		maleList.forEach(s -> System.out.println("남학생: " + s.getName()));
		
		//여학생들만 묶어 List생성.
		List<Student> femaleList = totalList.stream()
									.filter(s -> s.getSex() == Sex.FEMALE)
									.collect(Collectors.toList());
		
		femaleList.forEach(s -> System.out.println("여학생: " + s.getName()));
		
		//여학생들만 묶어 HashSet생성.
		Set<Student> femaleSet = totalList.stream()
									.filter(s -> s.getSex() == Sex.FEMALE)
									.collect(Collectors.toCollection(() -> new HashSet<Student>()));
		femaleSet.forEach(s -> System.out.println("여학생: " + s.getName()));

	}

}
