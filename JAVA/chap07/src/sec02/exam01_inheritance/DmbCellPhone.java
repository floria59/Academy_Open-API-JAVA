package sec02.exam01_inheritance;


// 자식클래스(하위클래스) extends 부모클래스(상위클래스)
public class DmbCellPhone extends  CellPhone{
	//필드: 부모클래스의 2개필드 사용가능
	int channel;
	
//	DmbCellPhone() {
//		System.out.println("자식클래스 생성자 호출");
//	}
	
	
	//생성자. 수동으로 생성자를 생성시에는 자동으로 기본생성자가 만들어지지 않는다.
	DmbCellPhone(String model, String color, int channel){
		
		super(); // 상속관계시 컴파일과정에 의하여, 자동으로 생성된다.
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	
	// 메소드 : 부모클래스의 6개메서드 사용가능.
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번 으로 변경합니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}
