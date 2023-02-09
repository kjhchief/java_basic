package Vehi;

public class Vehicle {
	private int id;
	private String color;

	// 생성자
	public Vehicle() {
	}

	public Vehicle(int id, String color) {
		this.id = id;
		this.color = color;
	}

	// getter , setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	


	public void run() {
		System.out.println("차량이 달립니다.");
	}

}
