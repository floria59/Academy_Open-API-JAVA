package sec01.array_collection_compare;

import java.util.ArrayList;

public class GenericCollectionExample {

	public static void main(String[] args) {
		
		//컬렉션 기억장소의 특징은 유지한다.
		//힙영역의 기억장소가 제네릭타입으로 지정한 성격으로 생성된 된다.
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("홍길동");
		al1.add("손흥민");
		al1.add("이순신");
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(1);
		al2.add(2);
		
		ArrayList<Family> alPerson = new ArrayList<Family>();
		alPerson.add(new Family());
		alPerson.add(new Family());
		alPerson.add(new Family());
		alPerson.add(new Family());
		

	}

}

class Family {}
