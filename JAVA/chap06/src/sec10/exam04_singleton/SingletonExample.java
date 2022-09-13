package sec10.exam04_singleton;

import java.util.Calendar;

public class SingletonExample {

	public static void main(String[] args) {
		
		//Singleton클래스는 싱글톤패턴으로 생성했기에 생성자를 호출할수가 없다.
		//Singleton s1 = new Singleton();
		Singleton s1 = Singleton.getInstance(); //생성된 객체의 주소를 대입
		Singleton s2 = Singleton.getInstance(); // 생성된 객체의 주소를 대입
		
		//JDK 날짜,시간기능을 제공하는 클래스. 싱글톤 클래스 특징.
		Calendar cal = Calendar.getInstance();
		
		// 참조타입일 경우 == : 주소비교.
		if(s1 == s2) {
			System.out.println("같은 Singleton 객체입니다.");
		}else {
			System.out.println("다른 Singleton 객체입니다.");
		}
		

	}

}
