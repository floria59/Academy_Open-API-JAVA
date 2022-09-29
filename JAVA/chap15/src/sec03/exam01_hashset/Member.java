package sec03.exam01_hashset;

public class Member /* extends Object */ {

	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		System.out.println("객체비교시 hashCode() 호출");
		return name.hashCode() + age;
	}

	// new Member("홍길동", 30)
	// new Member("홍길동", 30)
	
	@Override
	public boolean equals(Object obj) {
		
		System.out.println("객체비교시 equals() 호출");
		
		if(obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name) && (member.age == age);
		}else {
			return false;
		}
	}
	
	

	
	
	//추가작업
	
	
}
