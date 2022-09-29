package sec04.exam01_hashmap;

import java.util.*;
import java.util.Map.Entry;


public class HashMapExample1 {

	public static void main(String[] args) {
		//컬렉션 특징의 기억장소 구조  key:value 형태로 설계.  Entry 표현
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//데이터저장
		map.put("손흥민", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95); // key가 중복되어 95가 저장되어 있음.
		
		System.out.println("총 Entry 수: " + map.size()); // 3
		
		//데이터 읽기(객체 찾기)
		System.out.println("\t홍길동 : " + map.get("홍길동"));  // 95
		System.out.println();
		
		//1)객체를 하나씩 처리. Iterator
		Set<String> keySet = map.keySet(); // key정보로 Set으로 참조.
		Iterator<String> keyInterator = keySet.iterator();
		while(keyInterator.hasNext()) {
			String key = keyInterator.next(); // key 정보를 읽어오고, 다음키로 위치가 이동.
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		//객체 삭제
		map.remove("홍길동");
		System.out.println("총 Entry 수: " + map.size()); // 2
		
		//2)객체를 하나씩 처리. Iterator -> Entry 형태로 Set참조작업
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		//객체 전체삭제
		map.clear();
		System.out.println("총 Entry 수: " + map.size());
		
		

	}

}
