package sec11.exam01_arrays;

// 객체정렬하기위한 조건으로 Comparable인터페이스를 구현해야 한다.
public class Member implements Comparable<Member> {

	String name;
	
	Member(String name){
		this.name = name;
	}
	
	//정렬기준 메소드 재정의.
	@Override
	public int compareTo(Member o) {
		
		System.out.println("compareTo : 정렬비교");
		
		return name.compareTo(o.name);
	}

}
