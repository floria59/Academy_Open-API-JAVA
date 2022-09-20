package sec03.exam04_clone;


// 객체복사가 되기위한 클래스는 조건이 있다.
// Cloneable 인터페이스를 구현한 클래스 이어야 한다.
public class Member /*  extends Object */ implements Cloneable {

	//필드 : 기본타입과 참조타입을 구분해서 확인
	//참조타입
	public String id;
	public String name;
	public String password;
	
	//기본타입
	public int age;
	public boolean adult;
	
	public Member(String id, String name, String password, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}
	
	// 객체복사기능을 갖는 메소드
	// 얕은복사
	public Member getMember() {
		Member cloned = null;
		
		try {
			cloned = (Member) clone(); //얕은복사. 즉 참조타입의 필드는 주소만 공유만하고. 새로운 객체생성안함.
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cloned;
	}
}
