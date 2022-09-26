package sec06.exam05_wait_notify;

public class ProducerThread extends Thread {

	private DataBox dataBox;
	
	public ProducerThread(DataBox dataBox) {
		this.dataBox = dataBox;
	}
	
	//생산자스레드에 의하여 데이터를 생성하는 작업.(제품 생산)
	@Override
	public void run() {
		for(int i=1; i<=3; i++) {
			String data = "Data-" + i;
			dataBox.setData(data);
		}
		
		
		
	}
}
