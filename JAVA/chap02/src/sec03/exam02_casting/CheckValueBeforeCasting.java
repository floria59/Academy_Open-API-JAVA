package sec03.exam02_casting;

public class CheckValueBeforeCasting {

	public static void main(String[] args) {
		// 기본데이터타입(원시타입) 8 개
		// 기본데이터타입값의 범위
		
		System.out.println("byte:" + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
		System.out.println("int:" + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
		
		int i = 128;
		
		// i변수이 값이 - 128보다 작거나  i변수의 값이 127보다 큰경우
		if ( ( i < Byte.MIN_VALUE) || ( i > Byte.MAX_VALUE))
		{
			System.out.println("byte타입으로 변환 불가능");
		}
		else
		{
			byte b = (byte) i;
			System.out.println(b);
		}

	}

}
