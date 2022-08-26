package ch05;

public class Exercise {
	
	public static void main(String[] args) {
		//섭씨가 -60부터 140까지 증가, 섭씨를 화씨로 변환 
		double c;
		for( c = -60; c < 140; c += 20) {
			System.out.println(c);
		}
	}
}
