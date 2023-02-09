package ezen.abstraction;

public class BangryCar extends Car {
	public BangryCar() {}
	public BangryCar(String name, String model, boolean status, int speed) {
		this.name = name;
		this.model = model;
		this.status = status;
		this.speed = speed;
	}
		
	public void turnOn() {
		System.out.println("시동켜짐");
	}
	public void turnOff() {
		System.out.println("시동꺼짐");
	}
	public void run() {
		System.out.println("달린다");
	}
	public void speedUp(int speed) {
		System.out.println("시속 "+speed+"km");
	}
	public void speedDown(int speed) {
		System.out.println(speed);
	}
	public void stop() {
		System.out.println("기계를 정지합니다.");
	}
}
