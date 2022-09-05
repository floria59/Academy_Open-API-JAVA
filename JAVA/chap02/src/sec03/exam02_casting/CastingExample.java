package sec03.exam02_casting;

public class CastingExample {

	public static void main(String[] args) {
		// 2)명시적형변환(Casting) -큰데이터타입의 값을 작은 데이터타입의 변수로 저장시 형변환작업을 명시적으로 해야한다
		// 우측이 큰 데이터탙입일경우는 자동형변환이 발생되지 않는다. 
		// = 기준으로 우측의 값이 좌측의 타입과 일치를 하고, 대입된다 ( 타입일치 )
		
		int intValue = 44032;
		
		// 정수값을 문자로 표현할 경우에는 char데이터 타입을 변환시켜야한다. 
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		long longvalue = 500;
		intValue = (int) longvalue;
		System.out.println(intValue);
		
		double doubleValue = 3.64;
		intValue = (int) doubleValue; // int형으로 변환되면서, 반올림없이 소수부분은 제거된다.
		System.out.println(intValue);
		

	}

}
