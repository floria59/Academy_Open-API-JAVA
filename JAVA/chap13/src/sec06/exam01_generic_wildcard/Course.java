package sec06.exam01_generic_wildcard;


//1) 과정이름과 수강생을 배열로 저장하는 구조
public class Course<T> {
	private String name; // 과정이름
	private T[] students; // 수강생 명단.  Person[] students
	
	public Course(String name, int capacity) {
		this.name = name;
		students = (T[])(new Object[capacity]); // Person[] (new Object[5])
	}
	
	public String getName() { return name;}
	public T[] getStudents() { return students;}  // Person[] getStudents()
	
	public void add(T t) {  // add(Person t)
		for(int i=0; i<students.length; i++) {
			if(students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
}
