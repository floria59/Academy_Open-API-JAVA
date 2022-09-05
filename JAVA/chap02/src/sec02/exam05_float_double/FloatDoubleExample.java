package sec02.exam05_float_double;

public class FloatDoubleExample {

	public static void main(String[] args) {
		
		// 실수값 저장. float(4) , double(8) 기본은 더블
		// 3.14 / 3.14d / 3.14D 동일한 double 실수형 데이터 타입 표현 8byte크기
		
		double var1 = 3.14D;
		
		//4byte의 기억장소에 3.14 8 byte크기의 데이터를 저장 (대입) 할 수가 없다. 
		// float var2 = 3.14;
		float var3 = 3.14F;
		
		//정밀도 테스트
		double var4 = 0.1234579883297897932793;
		float var5 = 0.1239491798643956983759F;
		
		System.out.println("var1: " + var1);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);
		
		//e사용하기
		int var6 = 3000000;
		double var7 = 3e6;
		float var8 = 3e6F;
		double var9 = 2e-3; // 2의 10-3승
		
		System.out.println("var6: " + var6);
		System.out.println("var7: " + var7);
		System.out.println("var8: " + var8);
		System.out.println("var9: " + var9);
		

	}

}
