package ezen.abstraction;

public class AbstractExample {

	public static void main(String[] args) {
		// 추상클래스는 객체를 생성할 수 없다.
//		Animal animal = new Animal();
		
		//추상클래스는 자동형변환에서 타입으로 사용할 수 있다.
		//다형성 적용할 수 있다.
		
		//둘 다 가능하지만 확장성 생각하면 Animal 타입으로 만드는게 낫다.
//		Bird bird = new Bird();
		Animal animal = new Bird("참새", 2);
		animal.eat();
		animal.cry();
		//추가된 메소드 호출을 위해 다운캐스팅
		//animal.fly();
		Bird bird = (Bird) animal;
		bird.fly();
		
		animal = new Cat("날라리오", 3);
		animal.eat();
		animal.cry();
		
		animal = new BisongDog("루니", 7);
		animal.eat();
		animal.cry();
		
	}

}
