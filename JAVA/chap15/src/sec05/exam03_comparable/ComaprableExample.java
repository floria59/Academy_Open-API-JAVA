package sec05.exam03_comparable;

import java.util.Iterator;
import java.util.TreeSet;

public class ComaprableExample {

	public static void main(String[] args) {
		
		//이진트리기반으로 데이터 저장시 오름차순으로 정렬된 형태로 관리된다.
		// 데이타가 저장될 때마다 대소 비교작업이 발생이 되어 정렬구조로 관리된다.
		TreeSet<Person> treeSet = new TreeSet<Person>();
		
		
		// 25  31 45 
		treeSet.add(new Person("홍길동", 45));
		treeSet.add(new Person("감자바", 25));
		treeSet.add(new Person("박지원", 31));
		
		Iterator<Person> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println(person.name + ":" + person.age);
		}

	}

}
