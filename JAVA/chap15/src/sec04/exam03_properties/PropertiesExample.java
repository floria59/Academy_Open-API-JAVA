package sec04.exam03_properties;

import java.io.FileReader;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) throws Exception {
		Properties properties = new Properties(); // 기억장소가 key:value구조 생성. 데이타타입은 string
		String path = PropertiesExample.class.getResource("database.properties").getPath();
		
		// /E:/doccomsa/Program%20Files/workspace/chap15/bin/sec04/exam03_properties/database.properties
		//System.out.println(path);
		//인코딩, 디코딩 관련내용.
		// 알파벳, 숫자, 몇개 특수문자를 제외한 문자들을 전송해서 사용하고자 할경우에 그대로 전송해서 사용이 불가능한 경우가 있다.
		// 인코딩으로 변환작업을 해주어야 전송에서 사용이 가능한데, 그 문자들을 사용시 디코딩으로 사용해야 하는 경우가 있다.
		path = URLDecoder.decode(path, "utf-8");
		// /E:/doccomsa/Program Files/workspace/chap15/bin/sec04/exam03_properties/database.properties
		//System.out.println(path);
		properties.load(new FileReader(path)); //입출력스트림 단원.
		
		
		properties.setProperty("db", "oracle");
		
		
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		// db 키가 존재하지 않으면 "mysql"값이 사용된다.
		String db = properties.getProperty("db", "mysql");
		
		System.out.println("driver: " + driver);
		System.out.println("url: " + url);
		System.out.println("username:" + username);
		System.out.println("password: " + password);
		System.out.println("db: " + db);

	}

}
