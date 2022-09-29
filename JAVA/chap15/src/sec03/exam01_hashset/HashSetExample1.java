package sec03.exam01_hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {

	public static void main(String[] args) {
		
		//Set컬렉션? 특징 - 순서 유지안됨(주머니), 중복불가
		
		//1)HashSet 클래스
		//<> 제네릭에서 사용하는 타입파라미터
		Set<String> set = new HashSet<String>();
		
		//데이터 저장하기
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("MyBatis");
		
		int size = set.size();
		System.out.println("총 객체수: " + size);  // 4
		System.out.println();
		
		//데이터 읽어오기(반복자: Iterator)
		Iterator<String> iterator = set.iterator();
		// iterator객체가 참조하는 현재위치에 데이타 존재유무체크
		while(iterator.hasNext()) {
			String element = iterator.next(); // 데이타를 읽고, 커서위치를 다음으로 이동
			System.out.println("\t" + element);
		}
		
		set.remove("JDBC");
		set.remove("MyBatis");
		
		System.out.println("총 객체수: " + set.size()); // 2
		
		//데이터 읽어오기 - 향상된 for문
		for(String element : set) {
			System.out.println("\t" + element);
		}
		
		set.clear(); // 컬렉션의 모든 요소제거.
		if(set.isEmpty()) { System.out.println("비어 있음");}

	}

}
