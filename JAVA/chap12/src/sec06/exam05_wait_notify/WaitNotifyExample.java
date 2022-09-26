package sec06.exam05_wait_notify;

public class WaitNotifyExample {

	public static void main(String[] args) {
		
		//공유객체 생성
		DataBox dataBox = new DataBox();
		
		ProducerThread producerThread = new ProducerThread(dataBox);
		ConsumerThread consumerThread = new ConsumerThread(dataBox);
		
		
		producerThread.start(); //1)생산자스레드
		consumerThread.start(); //2)소비자스레드
	}

}
