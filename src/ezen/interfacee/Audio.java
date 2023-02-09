package ezen.interfacee;

public class Audio implements RemoteControl{

	private int volume;
	private int memoryVolume;
	
	public int getVolume() {
		return volume;
	}
	
	//생성자 생략. 어차피 디폴트생성자 만들어짐.
	
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME; //볼륨 최대값에서 더 증가 안 되는거
		}else if(volume <RemoteControl.MIN_VOLUME){
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("Audio 현재 볼륨: " + this.volume);
	}
	//디폴트 메소드 오버라이딩 (오디오에 맞게 메소드를 업글한다)
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			this.memoryVolume = this.volume;
			System.out.println("무음 처리 합니다.");
			setVolume(RemoteControl.MIN_VOLUME); //원래는 같은 영역이라 RomoteControl 안 써도 먹힘. but 상수니까 가독성 위해 붙인다.
		}else {
			System.out.println("무음 해제합니다.");
			volume = memoryVolume;
		}
		
	}
	
}
