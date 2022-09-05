package sec02.exam01_byte;

public class ByteExample {

	public static void main(String[] args) {
		
		// byte데이타타입.  크기 : 1byte  범위:-128~127
		
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
		
		// 값의 범위가 오버플로우됨. 그래서 에러발생.
		//byte var6 = 128;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		
		

	}

}
