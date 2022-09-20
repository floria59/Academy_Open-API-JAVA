package sec03.exam03_toString;

public class SmartPhone  /* extends Object */ {

	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}

	//보통 Object클래스의 toString()메소드를 재정의를 할 경우에는 클래스의 필드정보 나타내는 목적으로 주로 한다
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return company + ", " + os;
	}
	
	
}
