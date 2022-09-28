package sec08.exam01_threadgroup;

public class ThreadGroupExample {
	
	public static void main(String[] args) {
		ThreadGroup myGroup = new ThreadGroup("myGroup"); //1)스레드그룹 생성
		WorkThread workThreadA = new WorkThread(myGroup, "workThreadA"); // workThreadA스레드를  myGroup스레드그룹 소속으로 추가의미.
		WorkThread workThreadB = new WorkThread(myGroup, "workThreadB");
		
		workThreadA.start();
		workThreadB.start();
		
		System.out.println("[ main 스레드 그룹의 list() 메소드 출력내용 ]");
		
		//main스레드의 main그룹객체를 참조.
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		mainGroup.list();
		System.out.println();
		

		
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {}
		
		System.out.println(" [ myGroup 스레드 그룹의 interrupt()메소드 호출 ]");
		
		// 그룹스레드를 이용하여, workThreadA.interrupt(); workThreadB.interrupt(); 개별적으로 할 필요가 없다.
		myGroup.interrupt(); 

	}
	
	
}
