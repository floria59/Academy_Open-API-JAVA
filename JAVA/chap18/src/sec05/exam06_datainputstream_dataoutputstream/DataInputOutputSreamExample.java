package sec05.exam06_datainputstream_dataoutputstream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class DataInputOutputSreamExample {

	public static void main(String[] args) throws Exception {
		// 바이트기반스트림 : 바이트단위로 입출력작업을 한다.
		// 기본데이타타입 boolean, char, short, int, long, float, double 단위는 입출력작업이 불가능
		
		//바이트기반 출력스트림
		FileOutputStream fos = new FileOutputStream("E:/doccomsa/temp/primitive.dat");
		// 위의 열거된 기본데이타타입을 가지고 입출력작업을 해주는 클래스
		DataOutputStream dos = new DataOutputStream(fos);
		
		//출력스트림작업
		//1)첫번째 데이타
		dos.writeUTF("홍길동");
		dos.writeDouble(95.5);
		dos.writeInt(1);
		
		//2)두번째 데이타
		dos.writeUTF("감자바");
		dos.writeDouble(90.3);
		dos.writeInt(2);
		
		//출력스트림만 flush() 존재한다.
		dos.flush(); dos.close(); fos.close();
		
		//입력스트림작업.  데이타 작업순서로 대로 읽어와야 한다.(중요)
		FileInputStream fis = new FileInputStream("E:/doccomsa/temp/primitive.dat");
		DataInputStream dis = new DataInputStream(fis);
		
		for(int i=0; i<2; i++) {
			String name = dis.readUTF(); // "홍길동", "감자바"
			double score = dis.readDouble(); // 95.5, 90.3
			int order = dis.readInt(); // 1, 2
			System.out.println(name + " : " + score + " : " + order);		
		}
		
		dis.close(); fis.close();
		

	}

}
