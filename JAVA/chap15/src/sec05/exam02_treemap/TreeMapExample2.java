package sec05.exam02_treemap;


import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample2 {

	public static void main(String[] args) {
		
		// 문자열 데이타는 유니코드로 정렬구조를 가지고 있다.  0 ~ 65535 범위(Ascii Code포함)
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		scores.put(new Integer(87), "홍길동");
		scores.put(new Integer(98), "이동수");
		scores.put(new Integer(75), "박길순");
		scores.put(new Integer(95), "신용권");
		scores.put(new Integer(80), "김자바");
		
		//내림차순
		NavigableMap<Integer, String> descendingMap = scores.descendingMap();
		Set<Entry<Integer, String>> descendingEntrySet = descendingMap.entrySet();
		for(Entry<Integer, String> entry : descendingEntrySet) {
			System.out.print(entry.getKey() + "-" + entry.getValue() + " ");
		}
		System.out.println();
		
		//오름차순
		NavigableMap<Integer, String> ascendingMap = descendingMap.descendingMap();
		Set<Entry<Integer, String>> ascendingEntrySet = ascendingMap.entrySet();
		for(Entry<Integer, String> entry : ascendingEntrySet) {
			System.out.print(entry.getKey() + "-" + entry.getValue() + " ");
		}
	}

}
