package sec05.exam03_comparable;

// 크고 작은 대소비교의 목적으로 클래스가 사용될 경우에는 작업의 조건이 있다.
// Comparable<T> 인터페이스를 구현해야 한다.
public class Person implements Comparable<Person>{
	
	public String name;
	public int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// 대소 비교로 사용될 메소드.  예> 나이를 대소비교로 하는 조건.
	// 오름차순.    내림차순으로 비교를 할려면 if(age < o.age ) return 1;  ~~ return -1
	@Override
	public int compareTo(Person o) {
		System.out.println("대소비교 호출 : compareTo()");
		if(age < o.age ) return -1;
		else if(age == o.age) return 0;
		else return 1;
	}

}
