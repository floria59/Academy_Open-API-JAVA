package sec07.exam04_other_constructor_call;

public class Car {
	
	// ������ �޼��尡 �ٸ� ������ �޼��带 ȣ�� (�ڵ��� ���뼺)
	
	//�ʵ�
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	//������
	Car() {
	}
	
	Car(String model) { // �������� ������ model���� �޾Ƽ� ����� ����;�
		this(model, null, 0); // color�� �⺻�� null, maxSpeed�� �⺻�� 0
	}
	
	Car(String model, String color) {
		this(model, color, 0);
	}
	
	// ����
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}

