package sec02.exam03_linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// 데이타 삽입, 삭제시 ArrayList보다 LinkedList가 더 성능이 좋다.
// 순차적으로 추가/삭제 : ArrayList > LinkedList
// 중간에 추가/삭제 : ArrayList < LinkedList
// 검색 : ArrayList > LinkedList

public class LinkedListExample {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		//ArrayList클래스 작업
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list1.add(0, String.valueOf(i)); // "0" 삽입.  뒤로 밀리는 작업발생.
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 작업시간: " + (endTime-startTime) + " ns");
		
		
		//LinkedList클래스 작업
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list2.add(0, String.valueOf(i)); // "0" 삽입
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 작업시간: " + (endTime-startTime) + " ns");
		

	}

}
