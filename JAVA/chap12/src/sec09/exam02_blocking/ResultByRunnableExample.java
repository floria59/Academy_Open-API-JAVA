package sec09.exam02_blocking;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

// 작업 처리 결과를 외부 객체에 저장하는 예제.
public class ResultByRunnableExample {

	public static void main(String[] args) {

		//스레드 풀 객체생성
		ExecutorService executorService = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors());
		
		System.out.println("[작업 처리 요청]");
		class Task implements Runnable {

			Result result;
			public Task(Result result) {
				this.result = result;
			}
			
			@Override
			public void run() {
				//실제 작업내용
				int sum = 0;
				for(int i=1; i<=10; i++) {
					sum += i;
				}
				
				result.addValue(sum);
				
			}
			
		}
		
		Result result = new Result();// 공유객체
		Runnable task1 = new Task(result); // 스레드객체생성
		Runnable task2 = new Task(result); // 스레드객체생성
		
		// 작업이 완료 될때까지 기다리다가(Blocking) 완료되면, future1, 2객체가 생성됨.
		Future<Result> future1 = executorService.submit(task1, result);
		Future<Result> future2 = executorService.submit(task2, result);
		
		try {
			result = future1.get();
			result = future2.get();
			System.out.println("[처리 결과]" + result.accumValue);
			System.out.println("[작업 처리 완료]");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("[ 실행 예외 발생함]" + e.getMessage());
		}
		
		executorService.shutdown();

	}

}

//결과를 받기위한 목적으로 사용하는 클래스
class Result {
	int accumValue; //공유자원 필드
	// 동기화.
	synchronized void addValue(int value) {
		accumValue += value;
	}
}
