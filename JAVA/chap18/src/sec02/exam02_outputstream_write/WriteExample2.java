package sec02.exam02_outputstream_write;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample2 {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("E:/doccomsa/temp/test2.txt");
		byte[] data = "ABC".getBytes();
		os.write(data);
		os.flush();
		os.close(); // flush()사용이 안되어 있으면, close()메소드가 내부적으로 호출한다.

	}

}
