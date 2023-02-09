package ezen.interfacee;

public class Avante implements Car {
	private String name;
	private String model;
	private boolean status;
	private int speed;

	public Avante() {
	}

	public Avante(String name, String model, boolean status, int speed) {
		super();
		this.name = name;
		this.model = model;
		this.status = status;
		this.speed = speed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public void turnOn() {
		System.out.println("아반떼가 시동을 겁니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("아반떼가 시동을 끕니다.");
	}

	@Override
	public void run() {
		System.out.println("아반떼가 주행합니다.");
	}

	@Override
	public void speedUp(int speed) {
		this.speed += speed;
		System.out.println("아반떼가 "+speed+"km로 주행합니다.");

	}

	@Override
	public void speedDown(int speed) {
		this.speed -= speed;
		System.out.println("아반떼가 "+speed+"km로 주행합니다.");

	}

	@Override
	public void stop() {
		System.out.println("아반떼가 정지합니다.");

	}

}
