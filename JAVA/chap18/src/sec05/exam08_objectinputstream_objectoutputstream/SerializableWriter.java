package sec05.exam08_objectinputstream_objectoutputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializableWriter {

	public static void main(String[] args) throws Exception {
		//파일을 생성하여, 객체를 저장
		FileOutputStream fos = new FileOutputStream("E:/doccomsa/temp/Object.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		ClassA classA = new ClassA();
		classA.field1 = 1;
		classA.field2.field1 = 2;
		classA.field3 = 3; 	//ClassA.field3 = 3; 해석
		classA.field4 = 4;
		
		oos.writeObject(classA);
		oos.flush(); oos.close(); fos.close();

	}

}
