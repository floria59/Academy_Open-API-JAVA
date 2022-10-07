package sec05.exam08_objectinputstream_objectoutputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class SerialVersionUIDExample2 {

	public static void main(String[] args) throws Exception {
		//역직렬화 예제
		FileInputStream fis = new FileInputStream("E:/doccomsa/temp/Object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ClassC classC = (ClassC) ois.readObject(); // 역직렬화
		System.out.println("field1: " + classC.field1);
		
		ois.close();
		fis.close();

	}

}
