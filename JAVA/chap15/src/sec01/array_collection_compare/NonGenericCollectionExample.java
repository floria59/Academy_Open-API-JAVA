package sec01.array_collection_compare;

import java.util.ArrayList;

public class NonGenericCollectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//컬렉션 기능을 제공하는 클래스로 객체생성시, Generic기능을 사용하지 않으면,
		//힙영역의 기억장소가 Object클래스 데이타타입으로 생성된다.
		//Object클래스의 하위 개념의 데이터포맷은 모두 사용이 가능하다.
		ArrayList al = new ArrayList();
		
		//자동형변환 발생
		al.add(1); // 박싱
		al.add(10.67); //박싱
		al.add("홍길동"); // 업캐스팅(하위클래스를 상위클래스로 형변환)
		al.add(true); //박싱
		al.add(new Person()); //업캐스팅(하위클래스를 상위클래스로 형변환)
		
		al.add(10);
		al.add(20);
		

	}

}

class Person {}
