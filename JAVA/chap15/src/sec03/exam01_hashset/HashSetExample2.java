package sec03.exam01_hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {

	public static void main(String[] args) {
		
		Set<Member> set = new HashSet<Member>();
		
		
		//객체를 추가시, 동일한 객체로 처리하고 싶을 경우에는 hashCode(), equals() 메소드를 동일한 객체가 되도록 구현해야 한다.(중요: 암기)
		set.add(new Member("홍길동", 30)); // 번지(주소)가 참조
		set.add(new Member("홍길동", 30)); // 번지(주소)가 참조
		
		System.out.println("총 객체수: " + set.size());
		
		/* "홍길동" 힙영역의 주소를 재사용.
		String name = "홍길동";
		String name2 = "홍길동";
		*/
		

	}

}
