package sec08.exam01_udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class UdpSendExample {

	public static void main(String[] args) throws Exception {
		// UDP? 비연결 지향
		// 데이터를 주고받을 때 연결절차가 없다.
		// 일방적으로 데이터를 발신자측에서 보낸다.
		// 연결절차 특징인 TCP보다 빠르게 전송한다.
		// 발신자측에서 패킷을 보내더라도 순서의 개념이 없다.
		// 보낸 패킷을  수신자측에서는 모두 수신이 안될수 있다.
		// 예> 편지(우편)
		
		DatagramSocket datagramSocket = new DatagramSocket();
		
		System.out.println("[발신시작]");
		
		for(int i=1; i<3; i++) {
			String data = "메시지" + i;
			byte[] byteArr = data.getBytes("UTF-8");
			//데이터 작업을 담담하는 클래스
			DatagramPacket packet = new DatagramPacket(byteArr, byteArr.length, new InetSocketAddress("localhost", 5001));
			
			datagramSocket.send(packet);
			System.out.println("보낸 바이트 수]: " + byteArr.length + " bytes");
		}
		
		System.out.println("[발신 종료]");
		
		datagramSocket.close();
		

	}

}
