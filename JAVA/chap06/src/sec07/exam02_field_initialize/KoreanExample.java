package sec07.exam02_field_initialize;

public class KoreanExample {
	public static void main(String[] args) {
		
		// new �ڿ��� ������ �޼��常 �;��ϴ� ��Ģ�� �ִ� !!
		
		// ��ü���� . �ν��Ͻ�
		Korean k1 = new Korean("ȫ�浿", "123456-1234567");
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);
		
		Korean k2 = new Korean("ȫ���", "654321-7654321");
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);
	}
}

