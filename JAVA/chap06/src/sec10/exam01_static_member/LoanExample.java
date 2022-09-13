package sec10.exam01_static_member;

import java.util.Calendar;

public class LoanExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//클래스명.멤버
		Loan.iYul = 7;
		
		
		//객체.멤버
		Loan loan1 = new Loan(); //객체생성 작업이전에 static영역에 iYul 메모리 생성
		loan1.name = "홍길동1";
		loan1.loanPrice = 5000;

		
		
		Loan loan2 = new Loan();
		loan2.name = "홍길동2";
		loan2.loanPrice = 3000;
		
		
		Loan loan3 = new Loan();
		loan3.name = "홍길동3";
		loan3.loanPrice = 8000;
		
		 
		//Calendar cal = Calendar.getInstance();
	}

}
