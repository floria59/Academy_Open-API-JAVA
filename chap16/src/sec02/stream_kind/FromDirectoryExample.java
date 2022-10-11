package sec02.stream_kind;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromDirectoryExample {

	public static void main(String[] args) throws Exception {
		// 폴더로부터 스트림 참조.
		Path path = Paths.get("e:/doccomsa/temp");
		Stream<Path> stream = Files.list(path);
		// p 매개변수 : "e:/doccomsa/temp" 경로의 하위폴더및 파일들의 정보를 참조.
		stream.forEach( p -> System.out.println(p.getFileName()));

	}

}
