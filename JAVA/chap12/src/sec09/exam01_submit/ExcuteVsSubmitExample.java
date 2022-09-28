package sec09.exam01_submit;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExcuteVsSubmitExample {

	public static void main(String[] args) throws Exception {
		
		// 스레드 풀에 최대스레드 2개를 가지고 10개의 스레드작업을 하는 예제.
		
		//스레드 풀 객체생성 : 스레드를 미리생성하여 보관하는 개념.
		
		//최대 스레드 개수가 2인 스레드 풀 생성한 의미. 
		// 스레드풀에서 제공하는 스레드는 데몬스레드가 아니다.
		// 데몬스레드가 아니기 때문에, main스레드가 종료가 되면, 내용에 따라 종료되지 않을 수도 있다.
		// 그래서, 스레드풀에서 제공하는 스레드를 종료하고 자 할 경우에는 수동으로 종료처리해야 한다.
		//1)스레드 풀 생성
		ExecutorService executorService = Executors.newFixedThreadPool(2); // 내부적으로 스레드풀에 작업스레드가 최대 2개 자동생성.
		
		for(int i=0; i<10; i++) {
			//2)작업내용 생성 : 스레드풀의 작업큐에 저장
			//익명구현객체방식으로 스레드가 작업정보 10개를 생성. 
			Runnable runnable = new Runnable() {
				
				@Override
				public void run() {
					// 스레드 총 개수및 작업 스레드 이름 출력
					ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor )executorService;
					int poolSize = threadPoolExecutor.getPoolSize(); // 스레드풀의 스레드 개수(실제 사용한 스레드 수를 출력함)
					String threadName = Thread.currentThread().getName();
					System.out.println("[총 스레드 개수: " + poolSize + " ] 작업자스레드 이름: " + threadName);
					
					//실행시에 예외 발생 시킴. 예외가 발생되어 해당 스레드가 제거되고, 새 스레드가 계속 생성된다.
					int value = Integer.parseInt("삼");
					
					
				}
			};
			
			// 3)스레드 풀의 작업큐(Queue)에 작업정보 10개가 등록및 실행
			// 스레드 풀을 동작시킬 때 사용하는 메소드는 2가지가 있다. execute(), submit 
			
			// 예외가 발생되면, 스레드가 종료된다.  스레드는 스레드 풀에서 제거된다.
			executorService.execute(runnable);
			
			// 예외가 발생되면, 스레드가 종료되지않고, 다음작업에 재사용한다. 부하를 줄이기위하여 보통 권장함.
			//executorService.submit(runnable);
			
			// 예외관련문법을 필수적으로 코딩해야 하는 규칙.
			Thread.sleep(10); // 0.01 초 일시정지
			
			
		}
		
		//4)스레드 풀 종료.
		executorService.shutdown();

	}

}
