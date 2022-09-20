package sec03.exam03_toString;

public class SmartPhoneExample {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
		
		// 재정의 안된 경우 출력 : sec03.exam03_toString.SmartPhone@15db9742 객체를 문자열로 표현한 형태
		// 재정의 된 경우 출력: 구글, 안드로이드
		System.out.println(myPhone.toString());  

	}

}
