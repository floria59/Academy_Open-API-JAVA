package sec05.exam04_comparator;

import java.util.Comparator;

public class DescendingComparator implements Comparator<Fruit> {

	//내림차순 정렬.
	@Override
	public int compare(Fruit o1, Fruit o2) {
		
		System.out.println("저장시 비교 : compare()호출");
		
		if(o1.price < o2.price) return 1;
		else if(o1.price == o2.price) return 0;
		return -1;
	}

}
