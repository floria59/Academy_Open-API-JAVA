package sec09.exam02_blocking;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NoResultExample {

	// 스레드 작업이 정상적으로 처리되었는 지 여부를 확인하는 예제. (리턴값이 없는 작업 완료통보)
	
	
	public static void main(String[] args) {
		//스레드 풀 객체생성.   Runtime.getRuntime().availableProcessors() : core 개수정보. 4
		ExecutorService executorService = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors());
		
		System.out.println("작업 처리 요청");
		
		// 리턴값이 없다.
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				//실제 작업내용
				int sum = 0;
				for(int i=1; i<=10; i++) {
					sum += i;
				}
				System.out.println("[처리 결과]" + sum);
				
			}
		};
		
		//지연객체.
		Future future = executorService.submit(runnable);
		
		try {
			future.get(); // 작업내용이 정상적으로 실행완료가 되면 null을 반환하고, 아니면 예외발생시킨다.
			System.out.println("[ 작업처리 완료]");
		} catch(Exception e) {
			System.out.println("[실행 예외 발생함]" + e.getMessage());
		}
		
		executorService.shutdown();

	}

}
