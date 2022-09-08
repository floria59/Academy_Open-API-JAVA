package sec07.exam03_constructor_overloading;

// 생성자 오버로딩 : 생성자 메서드를 여러개 정의가 가능하다. 
public class Car {
	
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자 // 에러가 나지 않고 가능하게 만들어주는게 바로 생성자 오버로딩이다. 
	Car() {
	}
	
	Car(String model) {
		this.model = model;
	}
	
	Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}


