package ezen.interfacee;

public interface RemoteControl {
	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;
	
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	// Java8 부터 디폴트 메소드 추가
	public default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리 합니다.");
			setVolume(RemoteControl.MIN_VOLUME); //원래는 같은 영역이라 RomoteControl 안 써도 먹힘. but 상수니까 가독성 위해 붙인다.
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	// static 메소드 추가
	public static void changeBattery() {
		System.out.println("배터리를 교환합니다.");
	}

}
