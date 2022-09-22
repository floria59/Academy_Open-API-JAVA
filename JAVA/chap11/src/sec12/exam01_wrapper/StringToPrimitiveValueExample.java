package sec12.exam01_wrapper;

public class StringToPrimitiveValueExample {

	public static void main(String[] args) {
		//문자열 데이타를 기본데이타 타입으로 변환
		
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("value1: " + value1);
		System.out.println("value2: " + value2);
		System.out.println("value3: " + value3);
		

	}

}
