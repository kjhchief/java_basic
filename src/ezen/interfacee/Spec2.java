package ezen.interfacee;

/**
 * 인터페이스 간에도 상속이 가능하며, 거기다가 다중 상속까지 된다.
 * @Author 김재훈
 * @Date 2023. 1. 6.
 */
public interface Spec2 extends Spec1, Weapon{
	public void doTask3();
}
