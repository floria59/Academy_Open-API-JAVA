package sec07.exam02_field_initialize;

public class Korean {
	
	//�ʵ�
	String nation = "���ѹα�";
	String name; 				// �⺻�� null
	String ssn; 				// �⺻�� null

	//������ �������� : �������� ������ �������� ���� �ʱ�ȭ.
	/*public Korean(String n, String s) {
	  name = n;
	  ssn = s;
	}
	*/
	
	// �ٸ��̸� �������� ���������� ���� , ��. ��. �� �߽�
	public Korean(String name, String ssn) {
	  this.name = name;
	  this.ssn = ssn;
	}
}

