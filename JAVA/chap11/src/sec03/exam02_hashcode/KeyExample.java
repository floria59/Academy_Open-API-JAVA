package sec03.exam02_hashcode;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// HashMap클래스의 특징?
		// HashMap클래스가 생성된 기억장소는 [key, value] 쌍으로 설계가되어있다.
		// key는 중복할수 가 없다는 성격을 가지고 있다.
		// 데이타를 저장할 때마다 key 중복검사 기능을 가지고 있다.
		// 중복된 키가 사용되면, 전에 정보는 소멸되고, 새로운 값이 저장된다.
		
		//사용법.
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		//데이타 삽입. 객체비교작업이 발생한다.
		hashMap.put(new Key(1), "홍길동"); // key: 힙영역의 주소
		hashMap.put(new Key(1), "이순신"); // key: 힙영역의 주소
		
		//기억장소에 저장된 데이타의 수
		System.out.println(hashMap.size());  // Object클래스의 객체비교 2. Key클래스의 재정의된 객체비교 1

	}

}
