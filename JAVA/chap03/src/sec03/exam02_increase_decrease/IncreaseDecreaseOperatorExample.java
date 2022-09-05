package sec03.exam02_increase_decrease;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		//증감연산자. 증가 ++ 감소 --
		// 전위형 : 변수앞에 사용,   후위형 : 변수뒤에 사용
		
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("--------------------");
		//증감연산자를 사용한 변수가 단독으로 사용시 1값 더한 후 변수의 값이 사용된다.
		x++; // 후위형증가 연산자   x = x + 1;
		++x; // 전위형증가 연산자  x = x + 1;
		
		// 변수앞에 사용하면, 변수에 1을 더한후 변수의 값을 읽어온다.
		// 변수뒤에 사용하면, 변수값을 먼저 읽어오고, 변수값 출력하고, 1이 더해진다.
		System.out.println("x=" + x++); // 출력은 12. 1이 후에 더해진다.
		
		// x= 13 인식
		
		z = ++x + y++; // y는 10으로 해석되고, 나중에 1이 더해진다.
		System.out.println("z=" + z);
		
		System.out.println("y=" + y);
		
	}

}
