package sec02.stream_kind;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import sec01.stream_introduction.Student;

public class FromCollectionExample {

	public static void main(String[] args) {
		//컬렉션으로부터 스트림 참조.
		List<Student> studentList = Arrays.asList(
			new Student("홍길동", 10),	
			new Student("신용권", 20),
			new Student("유미선", 30)
		);
		
		//컬렉션으로 스트림참조
		Stream<Student> stream = studentList.stream();
		//Consumer함수적 인터페이스? 매개변수 있고, 리턴값없다.
		// s ->  System.out.println() 리턴값 없다. void
		stream.forEach(s -> System.out.println(s.getName()));

	}

}
