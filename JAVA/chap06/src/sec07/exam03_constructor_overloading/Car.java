package sec07.exam03_constructor_overloading;

// ������ �����ε� : ������ �޼��带 ������ ���ǰ� �����ϴ�. 
public class Car {
	
	//�ʵ�
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	//������ // ������ ���� �ʰ� �����ϰ� ������ִ°� �ٷ� ������ �����ε��̴�. 
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


