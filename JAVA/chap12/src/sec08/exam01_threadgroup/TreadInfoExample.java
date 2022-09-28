package sec08.exam01_threadgroup;

import java.util.Map;
import java.util.Set;

public class TreadInfoExample {

	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setName("AutoSaveThread"); // 스레드이름
		autoSaveThread.setDaemon(true); // 데몬스레드(보조기능 스레드)
		autoSaveThread.start(); // start작업전 스레드의 속성을 먼저주자.
		
		// 프로세스 내 실행하는 모든 스레드에 대한 정보를 얻을 수 있다. 
		Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
		Set<Thread> threads = map.keySet();
		for(Thread thread : threads) {
			System.out.println("Name : " + thread.getName() + ((thread.isDaemon())? "(데몬스레드)" : "(주스레드)"));
			System.out.println("\t" + "소속그룹:" + thread.getThreadGroup().getName());
			System.out.println();
		}
		
	}

}
