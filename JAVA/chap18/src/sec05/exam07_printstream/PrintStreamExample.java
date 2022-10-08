package sec05.exam07_printstream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExample {

	public static void main(String[] args) throws Exception {
		//: 표준출력스트림. 콘솔에 데이타를 출력하는 기능.
		//System.out
		
		
		FileOutputStream fos = new FileOutputStream("E:/doccomsa/temp/file.txt"); 
		PrintStream ps = new PrintStream(fos);
		
		ps.println("[프린터 보조 스트림]");
		ps.print("마치 ");
		ps.println("프린터가 출력하는 것처럼");
		ps.println("데이터를 출력합니다.");
		
		ps.flush();
		ps.close();
		fos.close();
		
		

	}

}
