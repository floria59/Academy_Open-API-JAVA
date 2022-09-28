package sec08.exam01_threadgroup;

import java.util.Map;
import java.util.Set;

public class ThreadInfoExample {

	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setName("AutoSaveThread"); //스레드이름
		autoSaveThread.setDaemon(true); // 데몬스레드(보조기능 스레드)
		autoSaveThread.start(); // 스레드 속성설정을 작업한후에 다음 메소드를 호출
		
		//프로세스 내에서 실행하는 모든 스레드에 대한 정보를 참조.
		Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
		Set<Thread> threads = map.keySet();
		for(Thread thread : threads) {
			System.out.println("Name: " + thread.getName() + ((thread.isDaemon()? "(데몬)": "(주)")));
			System.out.println("\t" + "소속그룹: " + thread.getThreadGroup().getName());
			System.out.println();
		}

	}

}
