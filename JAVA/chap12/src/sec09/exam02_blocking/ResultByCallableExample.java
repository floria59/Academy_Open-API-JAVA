package sec09.exam02_blocking;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultByCallableExample {

	// 작업내용이 완료 통보를 받으면서 리턴값을 받는 예제. 
	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors());
		
		System.out.println("[ 작업처리 요청]");
		// 리턴값이 있다.
		Callable<Integer> task = new Callable<Integer>() {
			
			@Override
			public Integer call() throws Exception {
				
				int sum = 0;
				for(int i=1; i<=10; i++) {
					sum += i;
				}
				return sum;
			}
		};
		
		//지연객체 : 작업내용이 언제 끝날 지 모르기땜분에 막연하게 기다리는 개념. blocking
		Future<Integer> futrue = executorService.submit(task);
		
		//작업내용에 대한 리턴값을 받아옴.
		try {
			int sum = futrue.get();
			System.out.println("[처리 결과] " + sum);
			System.out.println("[작업 처리 완료]");
		
		}catch(Exception e) {
			System.out.println("[실행 예외 발생함 ]" + e.getMessage());
		}
		
		executorService.shutdown();
				

	}

}
