package sec08.exam04_overloading;

// �޼ҵ� �����ε� - �������� ���Űǰ��� ���� ,, ������ ���������� �����ϵ���,,

public class Calculator {
	
	//���簢���� ����
	double areaRectangle(double width) {
		return width * width;
	}
	
	//���簢���� ����
	double areaRectangle(double width, double height) {
		return width * height;
	}	
}

