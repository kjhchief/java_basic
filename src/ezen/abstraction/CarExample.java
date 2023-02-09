package ezen.abstraction;

import java.awt.Component;

public class CarExample {
	public static void main(String[] args) {
		Car bangrycar = new BangryCar("붕붕이", "SD-1234", true, 0);
		System.out.println(bangrycar.getName());
		System.out.println(bangrycar.getModel());
		System.out.println(bangrycar.isStatus());
		System.out.println(bangrycar.getSpeed());

		bangrycar.turnOn();
		bangrycar.turnOff();
		bangrycar.run();
		bangrycar.speedUp(50);
		bangrycar.speedDown(10);
		bangrycar.stop();
		
		

	}
}
