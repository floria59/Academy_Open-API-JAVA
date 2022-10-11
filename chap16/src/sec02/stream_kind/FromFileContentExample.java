package sec02.stream_kind;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromFileContentExample {

	public static void main(String[] args) throws Exception {
		// 파일로부터 스트림 참조.
		Path path = Paths.get("src\\sec02\\stream_kind\\linedata.txt");
		Stream<String> stream;
		
		//Files.lines()메소드 이용
		stream = Files.lines(path, Charset.defaultCharset());
		stream.forEach(str -> System.out.println(str)); //람다식
		stream.close();
		System.out.println();
		
		//BufferedReader의 lines()메소드 이용.  java.nio -> java.io
		File file = path.toFile();
		FileReader fileReader = new FileReader(file);
		BufferedReader br = new BufferedReader(fileReader);
		stream = br.lines();
		stream.forEach(System.out :: println); //메소드 참조
		stream.close();
		
		

	}

}
