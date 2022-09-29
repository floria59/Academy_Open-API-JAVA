package sec05.exam02_treemap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapExample1 {

	// 객체를 찾거나 범위검색에 속도가 빠르다. 그에 따른 메소드를 지원한다.
	// 이진트리로 구조를 갖고 있다. 데이타가 저장시 오름차순으로 정렬구조로 관리된다.
	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		scores.put(new Integer(87), "홍길동");
		scores.put(new Integer(98), "이동수");
		scores.put(new Integer(75), "박길순");
		scores.put(new Integer(95), "신용권");
		scores.put(new Integer(80), "김자바");
		
		Entry<Integer, String> entry = null;
		
		entry = scores.firstEntry();
		System.out.println("가장 낮은 점수: " + entry.getKey() + "-" + entry.getValue());
		
		entry = scores.lastEntry();
		System.out.println("가장 높은 점수: " + entry.getKey() + "-" + entry.getValue());
		
		entry = scores.lowerEntry(new Integer(95));
		System.out.println("95보다 바로 아래 점수: " + entry.getKey() + "-" + entry.getValue());
		
		entry = scores.higherEntry(new Integer(95));
		System.out.println("95보다  바로 위 점수: " + entry.getKey() + "-" + entry.getValue());
		
		entry = scores.floorEntry(new Integer(95));
		System.out.println("95이거나  바로 아래 점수: " + entry.getKey() + "-" + entry.getValue());
		
		entry = scores.ceilingEntry(new Integer(85));
		System.out.println("85이거나   바로 위 점수: " + entry.getKey() + "-" + entry.getValue());
		
		while(!scores.isEmpty()) {
			entry = scores.pollFirstEntry(); //낮은 점수 -> 큰 점수 꺼내오고, 제거
			System.out.println(entry.getKey() + "-" + entry.getValue() + " (남은 객체 수: " + scores.size());
		}
		

	}

}
