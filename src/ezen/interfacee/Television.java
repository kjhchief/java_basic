package ezen.interfacee;

public class Television implements RemoteControl{

	private int volume;
	
	//생성자 생략. 어차피 디폴트생성자 만들어짐.
	
	public int getVolume() {
		return volume;
	}

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
		
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
		System.out.println("TV 현재 볼륨: " + this.volume);
	}
	
}
