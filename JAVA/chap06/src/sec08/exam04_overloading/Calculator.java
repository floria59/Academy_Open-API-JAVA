package sec08.exam04_overloading;

// 메소드 오버로딩 - 개발자의 정신건강을 위해 ,, 동일한 변수명사용이 가능하도록,,

public class Calculator {
	
	//정사각형의 넓이
	double areaRectangle(double width) {
		return width * width;
	}
	
	//직사각형의 넓이
	double areaRectangle(double width, double height) {
		return width * height;
	}	
}

