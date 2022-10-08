package sec03.exam01_system_in_out;

import java.io.IOException;
import java.io.OutputStream;

public class SystemOutExample {

	public static void main(String[] args) throws Exception {
		// System.out: 표준출력스트림. 콘솔에 데이터를 내보내는 기능. 쓰는 기능. 결과적으로 모니터를 통하여 보게된다.
		OutputStream os = System.out;
		// 0123456789 : 아스키코드
		for(byte b= 48; b<58; b++) {
			os.write(b);
		}
		os.write(10); // 라인피드(줄바꿈)
		// abcdefghijklmnopqrstuvwxyz : 아스키코드
		for(byte b=97; b<123; b++) {
			os.write(b);
		}
		os.write(10); // 라인피드(줄바꿈)
		
		// 자바 인코딩 : UTF-8(가변).   영어,숫자 : 1byte, 한글 : 3byte로 관리.
		// UTF-16 : 모든문자(영어,숫자,비영어권문자포함, 이모티콘 등) 2바이트로 관리. 
		String hangul = "가나다라마바사아자차카타파하";
		byte[] hangulBytes = hangul.getBytes();
		os.write(hangulBytes);
		
		os.flush();
		os.close();

	}

}
