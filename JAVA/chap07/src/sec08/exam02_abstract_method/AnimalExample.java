package sec08.exam02_abstract_method;

public class AnimalExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("-------------");
		
		Animal animal = null; //필드의 다형성
		animal = new Dog(); //자동 형변환
		animal.sound(); // "멍멍"
		animal = new Cat();
		animal.sound(); //"야옹"System.out.println("-------------");

		animalSound(new Dog());
		animalSound(new Cat());
	}
	
	// 매개변수의 다형성
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
