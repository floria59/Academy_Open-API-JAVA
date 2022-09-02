package sec02.exam01_byte;

public class ByteExample {

	public static void main(String[] args) {
		
		// byte 데이터타입. 크기 : 1byte 범위 : -128 ~ +127
		
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;

		// byte var6 = 128; -> 값의 범위를 벗어났기때문에 에러가난다.
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		
	}

}
