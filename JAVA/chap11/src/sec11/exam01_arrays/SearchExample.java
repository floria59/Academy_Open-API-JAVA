package sec11.exam01_arrays;

import java.util.Arrays;

public class SearchExample {

	public static void main(String[] args) {
	
		//기본데이터 타입 값 검색
		int[] scores = { 99, 97, 98};
		Arrays.sort(scores); //오름차순 정렬
		System.out.println(Arrays.toString(scores));
		int index = Arrays.binarySearch(scores, 99);
		System.out.println("찾은 인덱스: " + index);
		
		//문자열검색
		String[] names = { "홍길동", "박동수", "김민수"};
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		index = Arrays.binarySearch(names, "홍길동");
		System.out.println("찾은 인덱스: " + index);
		
		//객체검색(클래스 배열)
		Member m1 = new Member("홍길동");
		Member m2 = new Member("박동수");
		Member m3 = new Member("김민수");
		Member[] members = { m1, m2, m3};
		Arrays.sort(members); // m3, m2, m1
		index = Arrays.binarySearch(members, m1);
		System.out.println("찾은 인덱스: " + index);
		
		
		
		
		
				

	}

}
