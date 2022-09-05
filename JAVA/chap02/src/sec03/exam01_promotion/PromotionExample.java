package sec03.exam01_promotion;

public class PromotionExample {

	public static void main(String[] args) {
		// 형변환(Casting)
		// 1)자동형변환(promotion) - 작은데이터타입의 값을 큰데이터타입의 변수로 저장시 형변환을 하지않고, 자동처리
		
		
		// 숫자형 데이터타입 크기(서열) / 정수형 데이터타입보다는 실수형 데이터타입이 더 큰 개념으로 정의되어 있다. 
		// byte < short(char) < int < long < float < double
		// 작은 데이터타입의 값을 큰 데이터타입의 기억장소에 자동으로 형변환과정이 일어나 저장이 이루어진다. 
		
		// 변수 = 값; 값이 좌측의 변수 타입에 맞게 형변환이 일치해야한다. (타입일치)
		
		byte bytevalue = 10;
		// int > byte
		int intvalue  = bytevalue; // 자동형변환
		System.out.println(intvalue);
		
		char charvalue = '가';
		intvalue = charvalue;
		System.out.println("가의 유니코드 = " + intvalue);
		
		intvalue = 500;
		// intvalue 변수의 값을 읽어와서, 좌측의 변수 데이터타입 long형으로 변화되어, 값이 대입된다. 
		long longvalue = intvalue;
		System.out.println(longvalue);
		
		
		intvalue = 200;
		double doublevalue = intvalue;
		System.out.println(doublevalue);
		
	}

}
