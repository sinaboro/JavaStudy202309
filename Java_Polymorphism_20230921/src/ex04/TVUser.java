package ex04;

public class TVUser {
	public static void main(String[] args) {
		
		TV tv = new LgTVSub();
		
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
	}
}
