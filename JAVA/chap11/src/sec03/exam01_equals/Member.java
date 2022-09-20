package sec03.exam01_equals;

// 모든 클래스들은 Object클래스를 자동으로 상속받는다.
public class Member /* extends Object */ {

	public String id;
	
	public Member(String id) {
		this.id = id;
	}

	//비교기능 메소드 재정의 : 비교기준(문자열 데이타비교)
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Member) {
			Member member = (Member) obj;
			//비교
			if(id.equals(member.id)) {
				return true;
			}
		}
				
		return false;
	}
	
	
	
	
	
}
