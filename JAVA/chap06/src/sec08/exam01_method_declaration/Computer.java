package sec08.exam01_method_declaration;

public class Computer {
	
	// �Ķ���Ͱ� ����Ÿ���� ��쿡�� �������� ������ ������ �ּҰ� ���Եȴ�. 
	int sum1(int[] values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	// �Ű������� �����ϴ� �μ����� ������ ���� . 0 ���̻��� �����ϴ�.
	int sum2(int ... values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}
