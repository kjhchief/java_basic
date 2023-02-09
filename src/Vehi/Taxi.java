package Vehi;

public class Taxi extends Vehicle {
	private int corpNumber;
	
	public Taxi() {}
	public Taxi(int corpNumber) {
		//부모꺼 super로 안 받음.
		this.corpNumber = corpNumber;
	}
	
	public int getCorpNumber() {
		return corpNumber;
	}
	public void setCorpNumber(int corpNumber) {
		this.corpNumber = corpNumber;
	}
	
}
