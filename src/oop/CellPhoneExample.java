package oop;

public class CellPhoneExample {

	public static void main(String[] args) {
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);
		
		System.out.println("모델: " + dmbCellPhone.getModel());
		System.out.println("색상: " + dmbCellPhone.getColor());
		System.out.println("색상: " + dmbCellPhone.getChannel());
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("방가방가");
		dmbCellPhone.receiveVoice("멍멍");
		dmbCellPhone.hangUp();
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannel(15);
		dmbCellPhone.turnOffDmb();
		dmbCellPhone.powerOff();
		
		dmbCellPhone.setModel("삼성폰");
		System.out.println(dmbCellPhone.getModel());
		dmbCellPhone.setColor("흰색");
		System.out.println(dmbCellPhone.getColor());
		
	}

}
