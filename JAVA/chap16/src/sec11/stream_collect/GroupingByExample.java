package sec11.stream_collect;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import sec11.stream_collect.Student.City;
import sec11.stream_collect.Student.Sex;

public class GroupingByExample {

	public static void main(String[] args) {
		
		// 컬렉션에 동일한 데이타를 그룹화하는 예제.
		// 성별, 도시별
		List<Student> totalList = Arrays.asList(
				new Student("홍길동", 10, Sex.MALE, Student.City.Seoul),
				new Student("김수애", 6, Sex.FEMALE, Student.City.Pusan),
				new Student("신용권", 10, Sex.MALE, Student.City.Pusan),
				new Student("박수미", 6, Sex.FEMALE, Student.City.Seoul)
		);
		
		// 성별(남학생, 여학생)로 데이터를 그룹화하고, 이름을 출력하라.
		Map<Student.Sex, List<Student>> mapBySex = totalList.stream()
					.collect(Collectors.groupingBy(s -> s.getSex()));
		
		System.out.println("[남학생] ");
		mapBySex.get(Student.Sex.MALE).stream().forEach(s->System.out.println(s.getName() + " "));
		
		System.out.println("[여학생] ");
		mapBySex.get(Student.Sex.FEMALE).stream().forEach(s->System.out.println(s.getName() + " "));
		
		System.out.println();
		
		//도시별(Seoul, Pusan) 별 데이터를 그룹화하고, 이름을 출력하라.
		Map<Student.City, List<String>> mapByCity = totalList.stream()
						.collect(
								Collectors.groupingBy(
										Student :: getCity, 
										Collectors.mapping(Student::getName, Collectors.toList())));
		
		
	   System.out.println("[서울]");
	   mapByCity.get(City.Seoul).stream().forEach(s -> System.out.println(s + " "));
	   
	   System.out.println("[부산]");
	   mapByCity.get(City.Pusan).stream().forEach(s -> System.out.println(s + " "));
		
		
		

	}

}
