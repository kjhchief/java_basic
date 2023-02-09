package oop;

public class CellPhone {
	private String model;
	private String color;
	
	public CellPhone() {
		this(null, null);
	}
	public CellPhone(String model, String color) {
		 this.model = model;
		 this.color = color;
	}
	
	// getter / setter 틀렸지만 일단 놔두기
	public String getModel() {
		return this.model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void powerOn() { //리턴값이 없다. 근데 내용은 나오는 기능이다. 헷갈린다.
		System.out.println("전원을 켭니다");
	}
	public void powerOff() {
		System.out.println("전원을 끕니다");
	}
	public void bell() {
		System.out.println("벨이 울립니다");
	}
	public void sendVoice(String message) {
		System.out.println(message + "를 전송합니다.");
	}
	public void receiveVoice(String message) {
		System.out.println(message + "를 수신합니다.");
	}
	public void hangUp() {
		System.out.println("전화를 끊습니다");
	}
	
	
}
