package sec02.exam01_byte;

public class GarbageValueExample {

	public static void main(String[] args) {
		//정수형 데이타타입 byte,short,int,long 은 사용범위의 값이 초과하여, 오버플로우 현상발생
		//사용할수 없는 값을 쓰레기값 이라고 표현하며, 프로그램 실행의 문제가 발생된다.
		// 값이 오버플로우가 발생되면, 로테이트에 의하여 돌면서 값이 저장된다.

		
		byte var1 = 125; // 범위가 작으므로 값이 오버플로우(128)가 되면 , 로테이트 값 (-128)으로 관리가 된다
		int var2 = 125;
		
		// 변수 증감연산자 
		// ++변수, 변수++, --변수, 변수--
		
		for ( int i = 0; i < 5; i++) {
			
			var1++; // 후위형증가연산자 var1 = var1 + 1
			var2++; // 후위형증가연산자 var2 = var2 + 1
			
			System.out.println("var1: " + var1 + "\t" + "var2: " + var2);
			
		}

	}

}
