package sec07.exam04_array_management;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run(); // 0 이상없음. 1,2,3,4 타이어 이상
			if(problemLocation != 0) {
							
				if(problemLocation % 2 != 0) { // 1, 3
					System.out.println(car.tires[problemLocation-1].location + " 한국타이어로 교체");
					//배열(필드) 다형성
					car.tires[problemLocation-1] = new HankookTire(car.tires[problemLocation-1].location, 15);
				}else { // 2, 4
					System.out.println(car.tires[problemLocation-1].location + " 금호타이어로 교체");
					
					//배열(필드) 다형성
					car.tires[problemLocation-1] = new KumhoTire(car.tires[problemLocation-1].location, 10);
				}
			}
			System.out.println("=================================================");
		}

	}

}
