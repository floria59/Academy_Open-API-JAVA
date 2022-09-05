package sec04.exam03_compare;

public class CompareOperatorExample1 {

	public static void main(String[] args) {
		
		//관계연산자,  >, < , <=, >=, ==, !=
		int num1 = 10;
		int num2 = 10;
		boolean result1 = ( num1 == num2 );
		boolean result2 = (num1 != num2 );
		boolean result3 = (num1 <= num2);
		System.out.println("result1= " + result1);
		System.out.println("result2= " + result2);
		System.out.println("result3= " + result3);
		
		// 모든데이타 유형은 비교가 가능하다. 내부적으로는 숫자로 관리되므로.
		
		char char1 = 'A'; // 65
		char char2 = 'B'; // 66
		boolean result4 = (char1 < char2);  // true
		System.out.println("result4= " + result4);

	}

}
