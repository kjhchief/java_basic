package oop;

public class InstanseOfExample {
	public static void main(String[] args) {
		Bird bird = new Bird(); //bird가 객체다. 얘가 어떤 상태인지 확인하는게 인스턴스오브
		
		System.out.println(bird instanceof Bird);
		System.out.println(bird instanceof Animal);
		System.out.println(bird instanceof Object);
//		System.out.println(bird instanceof Dog); 아예 안 됨. 직계도 아니고 암것도 아니여. 아예 상관 없으니까.
	}
}
