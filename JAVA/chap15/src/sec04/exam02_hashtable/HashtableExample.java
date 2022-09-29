package sec04.exam02_hashtable;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableExample {

	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>();
		
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		
		//콘솔환경에서 데이터를 입력받아 읽어들이는 기능을 제공
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디와 비밀번호를 입력해주세요.");
			System.out.print("아이디: ");
			//콘솔환경에서 데이터를 입력받아, 버퍼에 저장되어 있는 데이터를 읽어들인다.(엔터키값은 제외한다.)
			//버퍼의 정보를 읽게되면, 버퍼의 해당정보는 비워진다.
			String id = scanner.nextLine();
			
			System.out.print("비밀번호: ");
			String password = scanner.nextLine();
			System.out.println();
			
			//아이디가 존재한다면
			if(map.containsKey(id)) {
				if(map.get(id).equals(password)) {
					System.out.println("로그인 되었습니다.");
					break; // while반복문이 빠져나온다.
				}else {
					System.out.println("비밀번호가 일치되지 않습니다.");
				}
			}else {
				System.out.println("아이디가 일치되지 않습니다.");
			}
		}

	}

}
