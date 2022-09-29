package sec05.exam01_treeset;

import java.util.TreeSet;

public class TreeSetExample1 {

	// 객체를 찾거나 범위검색에 속도가 빠르다. 그에 따른 메소드를 지원한다.
	// 이진트리로 구조를 갖고 있다. 데이타가 저장시 오름차순으로 정렬구조로 관리된다.
	// 숫자데이터는 값으로 정렬, 문자열은 유니코드로 정렬
	public static void main(String[] args) {
		
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));
		
		Integer score = null;
		
		score = scores.first();
		System.out.println("가장 낮은 점수: " + score); // 75
		
		score = scores.last();
		System.out.println("가장 높은 점수: " + score); //98
		
		score = scores.lower(new Integer(95));
		System.out.println("95점 아래 점수: " + score); // 87
		
		score = scores.higher(new Integer(95));
		System.out.println("95점 위의 점수: " + score); // 98
		
		score = scores.floor(new Integer(95)); 
		System.out.println("95점 이거나 바로 아래 점수: " + score); // 95
		
		score = scores.ceiling(new Integer(85));
		System.out.println("85점 이거나 바로 위의 점수: " + score); // 87
		
		while(!scores.isEmpty()) { // pollLast() : 내림차순(높은것->낮은것)
			score = scores.pollFirst(); //제일 낮은 점수객체를 꺼내오고, 제거함. 오름차순(낮은것->높은것)
			System.out.println(score + " (남은 객체 수: " + scores.size() + ")");
		}
		
		

	}

}
