package sec02.runtime_exception;

public class ArrayIndexOutOfBoundsExceptionExample {

	public static void main(String[] args) {
		
		String data1 = args[0];
		String data2 = args[1]; // ArrayIndexOutOfBoundsException클래스 예외발생.
		System.out.println("args[0]: " + data1);
		System.out.println("args[1]: " + data2);
		
		/*
		if(args.length == 2) {
			String data1 = args[0];
			String data2 = args[1];
			System.out.println("args[0]: " + data1);
			System.out.println("args[1]: " + data2);
		}else {
			System.out.println("실행방법");
			System.out.println("java ArrayIndexOutOfBoundsExceptionExample 값1 값2");
		}
		*/

	}

}
