package sec07.exam04_other_constructor_call;

public class Car {
	
	// 생성자 메서드가 다른 생성자 메서드를 호출 (코드의 재사용성)
	
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	Car() {
	}
	
	Car(String model) { // 내목적은 오로지 model값만 받아서 결과를 내고싶어
		this(model, null, 0); // color의 기본값 null, maxSpeed의 기본값 0
	}
	
	Car(String model, String color) {
		this(model, color, 0);
	}
	
	// 재사용
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}

