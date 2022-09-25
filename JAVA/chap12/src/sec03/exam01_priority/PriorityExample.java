package sec03.exam01_priority;

public class PriorityExample {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			//10개의 스레드객체가 생성. 스레드이름은 thread1,thread2,.... thread10
			Thread thread = new CalcThread("thread" + i);
			if(i != 10) {
				thread.setPriority(Thread.MIN_PRIORITY); // thread1~thread9 우선순위 1
			}else {
				thread.setPriority(Thread.MAX_PRIORITY); // thread10. 우선순위 10
			}
			thread.start();// 실행대기상태 등록.(CPU의 점유를 받을수 있는 의미)
		}

	}

}
