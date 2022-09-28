package sec02.exam01_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		//List컬렉션 ? 특징 - 인덱스관리, 중복허용
		
		//1)ArrayList클래스
		
		List<String> list = new ArrayList<String>();
		
		// 데이터 저장하기
		list.add("Java");  // 인덱스 0번 저장
		list.add("JDBC");  // 인덱스 1번 저장
		list.add("Servlet/JSP");  // 인덱스 2번 저장 -> 3번
		list.add(2, "DataBase"); // 인덱스 2에 삽입.
		list.add("MyBatis"); // 인덱스 4번 저장
		//중복허용
		//list.add("MyBatis");
		
		int size = list.size();
		System.out.println("총 객체수: " + size); // 5
		System.out.println();
		
		//데이터 읽어오기
		String skill = list.get(2);
		System.out.println("인덱스 번 2: " + skill); // DataBase
		System.out.println();
		
		//컬렉션의 모든 정보를 읽어오기. i는 0~4
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ": " + str);
		}
		System.out.println();
		
		//컬렉션 요소(개별기억장소) 인덱스 제거
		list.remove(2); // 실제 3번째 데이타위치 제거
		list.remove(2);
		
		//컬렉션 요소를 값으로 제거
		list.remove("MyBatis");
		
		//컬렉션의 모든 정보를 읽어오기. i는 0~1
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ": " + str);
		}
		
		
		
		

	}

}
