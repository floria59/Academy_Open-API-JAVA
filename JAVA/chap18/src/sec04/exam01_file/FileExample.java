package sec04.exam01_file;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {

	public static void main(String[] args) throws Exception {
		
		//File클래스? 파일,폴더와 관련된 기능을 제공.
		
		// 객체생성이 파일 또는 폴더생성을 바로 해주는 기능은 아니다.
		File dir = new File("E:/doccomsa/temp1/sub1"); // 폴더경로
		File file1 = new File("E:/doccomsa/temp/file1.txt"); // 파일경로
		File file2 = new File("E:/doccomsa/temp/file2.txt"); // 파일경로
		
		// URI: Uniform Resource Identifier
		//통합자원 식별자 : 네트웍상의 존재하는 자원을 가리키는 의미.
		// file, ftp, http, mailto, magnet, telent, urn, data 
		// file : 현재 시스템의 존재하는 자원을 가리킬때 사용.
		File file3 = new File(new URI("file:///E:/doccomsa/temp/file3.txt"));
		
		if(dir.exists() == false) { dir.mkdirs();} // 경로에 폴더가 존재하지않으면, 생성해서 sub1폴더를 생성한다.
		if(file1.exists() == false) { file1.createNewFile(); } // 파일이 존재안하면, 생성
		if(file2.exists() == false) { file2.createNewFile();}
		if(file3.exists() == false) { file3.createNewFile();}
		
		// 폴더에 존재하는 내용보기
		File temp = new File("E:/doccomsa/temp");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd    a   HH:mm");
		File[] contents = temp.listFiles();
		System.out.println("날짜                            시간                            형태                    크기                     이름");
		System.out.println("----------------------------------------------------------------");
		for(File file : contents) {
			System.out.print(sdf.format(new Date(file.lastModified())));
			if(file.isDirectory()) {
				System.out.print("\t<DIR>\t\t\t" + file.getName());
			}else {
				System.out.print("\t\t\t" + file.length() + "\t" + file.getName());
			}
			System.out.println();
		}
		
	}

}
