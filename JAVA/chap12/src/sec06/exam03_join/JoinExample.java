package sec06.exam03_join;

public class JoinExample {

	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();  // 실행대기상태(Runnable)
		
		try {
			sumThread.join();//sumThread 스레드가 완료되고나서,  main스레드는 cpu의 점유를 받게된다.
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("1~100 합: " + sumThread.getSum());

	}

}
