package sec03.exam01_name_implements_class;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		// 필드 다형성
		RemoteControl rc;
		rc = new Television();
		rc = new Audio();

	}

}
