package sec02.exam02_outputstream_write;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample3 {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("E:/doccomsa/temp/test2.txt");
		byte[] data = "ABC".getBytes();  // byte[0], byte[1], byte[2]
		os.write(data, 1, 2); // 스트림에 data배열의 인덱스1위치에서부터 2개를 쓴다.
		os.flush();
		os.close();

	}

}
