package sec06.exam05_wait_notify;

//1)공유자원으로 사용할 클래스
//Object클래스에서 제공하는 스레드제어상태 메소드.
// 메소드에 동기화 또는 동기화블록. 즉 synchronized 키워드를 사용해야 동작이 이루어진다.
// 생산자와 소비자 두 스레드는 wait, notify() 2개의 메소드를 함께 구성해야 한다.
// notify() : wait()에 일시정지된 스레드를 실행대기상태로 만든다.
// notifyAll() :  wait()에 일시정지된 모든스레드를 실행대기상태로 만든다.
public class DataBox {

	private String data; //공유자원 필드. 기본값 null
	
	//소비자 스레드가 호출하는 메소드
	public synchronized String getData() {
		// 제품이 없는 의미로 해석.
		if(this.data == null) {
			try {
				wait(); // 소비자스레드는 일시정지상태로 전환한다.
			} catch (InterruptedException e) {}
		}
		
		String returnValue = data; // 소비가 제품소비
		System.out.println("소비가가 읽은 데이터: " + returnValue); // 제품사용(구매)
		data = null; // 제품이 없는 의미로 해석
		notify(); //wait()로 일시정지 상태에 있는 생산자스레드를 Runnable(실행대기상태)로 전환하는 기능.
		return returnValue;
	}
	
	//생산자 스레드가 호출하는 메소드
	public synchronized void setData(String data) {
		// 첫 호출시 data는 기본값이 null이다.
		if(this.data != null) { // 제품이 존재하는 의미로 해석
			try {
				wait(); // 생산자스레드는 일시정지 상태로 전환이되고, 소비자스레드는  CPU의 점유를 받은 상태에서 제품구매.
			} catch (InterruptedException e) {} 
		}
		
		this.data = data; // 생산자스레드가 제품작업의 의미.
		System.out.println("생산자스레드가 생성한 데이터: " + data);
		notify(); //wait()로 일시정지된 스레드를 runnable상태전환
		
		
	}
}
