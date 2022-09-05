package sec03.exam02_increase_decrease;

public class IncreaseDecreaseOperatorExample2 {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 10;
		int z;
		
		z = ++x + --y;  // 11 + 9
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		
	}

}
