package ezen.interfacee;

public class DriverExample {

	public static void main(String[] args) {
		Car car = new K3("붕붕이", "K3", false, 0); //자동형변환
		Driver driver = new Driver(car);
		driver.drive();
		
		car = new Avante("슝슝이", "아반떼", false, 0);
		driver.setCar(car);
		driver.drive();
		
	}

}
