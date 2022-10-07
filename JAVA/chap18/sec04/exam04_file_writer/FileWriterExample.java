package sec04.exam04_file_writer;

import java.io.File;
import java.io.FileWriter;

public class FileWriterExample {

	public static void main(String[] args) throws Exception {
		File file = new File("E:/doccomsa/temp/file.txt");
		// 파일이 존재하지 않으면, 새로 생성작업
		// 파일이 존재하면, 기존파일을 유지한 채, 내용을 추가할 때 2번째 매개변수의 값에 true사용
		FileWriter fw = new FileWriter(file, true);
		fw.write("FileWirter는 한글로 된 " + "\r\n");
		fw.write("문자열을 바로 출력할 수 있다." + "\r\n");
		
		fw.flush();
		fw.close();
		System.out.println("파일에 저장되었습니다.");
		

	}

}
