package sec05.exam08_objectinputstream_objectoutputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputOutputStreamExample {

	public static void main(String[] args) throws Exception {
		//출력스트림으로 객체데이타를 직렬화하여, 작업
		FileOutputStream fos = new FileOutputStream("E:/doccomsa/temp/Object.dat");
		//객체직렬화 기능을 제공하는 보조스트림 클래스
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		//작업순서
		oos.writeObject(new Integer(10));
		oos.writeObject(new Double(3.14));
		oos.writeObject(new int[] {1, 2, 3 });
		oos.writeObject(new String("홍길동"));
		
		oos.flush(); oos.close(); fos.close();
		
		
		
		//입력스트림을 통하여, 직렬화된 데이타를 역직렬화작업으로 읽어온다.
		FileInputStream fis = new FileInputStream("E:/doccomsa/temp/Object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		//작업순서
		Integer obj1 = (Integer) ois.readObject();
		Double obj2 = (Double) ois.readObject();
		int[] obj3 = (int[]) ois.readObject();
		String obj4 = (String) ois.readObject();
		
		ois.close(); fis.close();
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3[0] + "," + obj3[1] + "," + obj3[2]);
		System.out.println(obj4);

	}

}
