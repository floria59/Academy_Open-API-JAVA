package sec15.exam01_format;

import java.text.DecimalFormat;

public class DecimalFormatExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num = 1234567.89;
		
		DecimalFormat df = new DecimalFormat("0"); //정수표현
		System.out.println( df.format(num)); // 1234568 반올림적용
		
		df = new DecimalFormat("0.0"); // 실수표현. 소수 첫째자리 표현
		System.out.println( df.format(num)); // 1234567.9 반올림적용
		
		df = new DecimalFormat("0000000000.00000"); // 정수,소수 자리표현
		System.out.println( df.format(num)); // 0001234567.89000 빈자리는 0으로 채움
		
		df = new DecimalFormat("#"); //정수표현
		System.out.println( df.format(num)); // 1234568 반올림적용
		
		df = new DecimalFormat("#.#");
		System.out.println( df.format(num)); // 1234567.9 반올림적용
		
		df = new DecimalFormat("##########.#####");
		System.out.println( df.format(num)); // 1234567.89 빈자리는 채우지 않음.
		
		df = new DecimalFormat("#.0");
		System.out.println( df.format(num)); // 1234567.9 반올림적용
		
		df = new DecimalFormat("+#.0");
		System.out.println( df.format(num)); // +1234567.9 반올림적용
		
		df = new DecimalFormat("-#.0");
		System.out.println( df.format(num)); // -1234567.9 반올림적용
		
		df = new DecimalFormat("#,###.0");
		System.out.println( df.format(num)); // 1,234,567.9 반올림적용
		
		df = new DecimalFormat("0.0E0");
		System.out.println( df.format(num)); // 1.2E6  지수표기법  원래값: 1234567.89
		
		df = new DecimalFormat("+#,### ; -#,###");
		System.out.println( df.format(num)); // +1,234,568 
		
		df = new DecimalFormat("#.#%");
		System.out.println( df.format(num)); // 123456789% 
		
		df = new DecimalFormat("\u00A4 #,###");
		System.out.println( df.format(num)); //￦ 1,234,568 반올림적용
		
		

	}

}
