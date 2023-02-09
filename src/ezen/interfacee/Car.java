package ezen.interfacee;

/**
 * 자동차 명세
 * @Author 김재훈
 * @Date 2023. 1. 6.
 */

public interface Car {
	public void turnOn();
	public void turnOff();
	public void run();
	public void speedUp(int speed);
	public void speedDown(int speed);
	public void stop();
	
}
