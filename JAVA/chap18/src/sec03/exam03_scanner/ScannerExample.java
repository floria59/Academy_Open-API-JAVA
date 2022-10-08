package sec03.exam03_scanner;

import java.io.InputStream;
import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		//Scanner클래스 : 콘솔환경에서 입력받은 데이터를 쉽게 사용하기위한 기능
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("문자열 입력> ");
		String inputString = sc.nextLine(); //입력한 데이터를 문자열로 저장. 
		System.out.println(inputString);
		System.out.println();
		
		System.out.print("정수 입력> ");
		int inputInt = sc.nextInt(); //정수 형태의 데이터를 사용
		System.out.println(inputInt);
		
		System.out.print("실수 입력> ");
		double inputDouble = sc.nextDouble(); // 실수 형태의 데이터를 사용
		System.out.println(inputDouble);
		
		


	}

}
