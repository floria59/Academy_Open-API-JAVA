package sec06.exam01_generic_wildcard;

import java.util.Arrays;

public class WildCardExample {

	// 과정에 등록한 과정명, 수강생명단출력
	// <?> 모든 클래스나 인터페이스가 사용이 가능하다. 4개 수강과정이 사용가능
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + " 수강생: " +
				Arrays.toString(course.getStudents()));
	}
	
	// <? extends Student> Student클래스 이거나 Student를 상속한 하위타입(자식클래스)
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + " 수강생: " +
				Arrays.toString(course.getStudents()));
	}
	
	// <? super Worker> Worker클래스 이거나 Worker클래스를 자식클래스로 둔 상위클래스들.
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + " 수강생: " +
				Arrays.toString(course.getStudents()));
	}
		
	public static void main(String[] args) {
		
		Course<Person> personCourse = new Course<Person>("일반인과정", 5);
		personCourse.add(new Person("일반인"));
		personCourse.add(new Worker("직장인"));
		personCourse.add(new Student("학생"));
		personCourse.add(new HighStudent("고등학생"));
		
		Course<Worker> workerCourse = new Course<Worker>("직장인과정", 5);
		workerCourse.add(new Worker("직장인"));
		
		Course<Student> studentCourse = new Course<Student>("학생과정", 5);
		studentCourse.add(new Student("학생"));
		studentCourse.add(new HighStudent("고등학생"));
		
		Course<HighStudent> highStudentCourse = new Course<HighStudent>("고등학생과정", 5);
		highStudentCourse.add(new HighStudent("고등학생"));
		
		//과정및수강생명단 등록과정.  
		// Course<?> course
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highStudentCourse);
		System.out.println();
		
		// <? extends Student>
//		registerCourseStudent(personCourse); (X)
//		registerCourseStudent(workerCourse); (X)
		
		registerCourseStudent(studentCourse);
		registerCourseStudent(highStudentCourse);
		
		// <? super Worker>
		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);
		
//		registerCourseWorker(studentCourse);  (X)
//		registerCourseWorker(highStudentCourse);  (X)
		
	}

}
