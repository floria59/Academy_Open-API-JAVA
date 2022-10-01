package sec05.exam03_supplier;

import java.util.function.IntSupplier;

public class SupplierExample {

	// Supplier (공급자)
	// 매개변수가 없고, 리턴값이 있다.
	public static void main(String[] args) {
		IntSupplier intSupplier = () -> {
			int num = (int) (Math.random() * 6) + 1;
			return num;
		};
		
		int num = intSupplier.getAsInt();
		System.out.println("주사위 눈의 수: " + num);

	}

}
