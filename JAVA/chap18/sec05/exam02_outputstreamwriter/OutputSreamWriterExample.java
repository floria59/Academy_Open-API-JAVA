package sec05.exam02_outputstreamwriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputSreamWriterExample {

	public static void main(String[] args) throws Exception {
		//바이트기반 출력스트림 생성
		FileOutputStream fos = new FileOutputStream("E:/doccomsa/temp/file.txt");
		//바이트 -> 문자 스트림으로 변환하여 작업
		Writer writer = new OutputStreamWriter(fos);
		
		String data = "바이트 출력 스트림을 문자 출력 스트림으로 변환";
		writer.write(data);
		
		writer.flush();
		writer.close();
		System.out.println("파일 저장이 끝났습니다.");

	}

}
