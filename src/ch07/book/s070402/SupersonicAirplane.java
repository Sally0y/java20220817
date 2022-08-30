package ch07.book.s070402;

public class SupersonicAirplane {
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flymode = NORMAL;
	
	@Overrude
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속비행입니다.");
		} else {
			super.fly()
;		}
	}

}
