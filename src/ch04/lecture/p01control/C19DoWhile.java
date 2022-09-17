package ch04.lecture.p01control;

public class C19DoWhile {
	public static void main(String[] args) {
		
		System.out.println(1);

		do {
			System.out.println(2);
			System.out.println(3);
		} while (false);         //  조건문이 false이면 do-while문 종료 
								 
								//	조건문이나 조건식이 true면, 
								 //  반복 조건이 만족될 동안 반복실행					
		System.out.println(4);
	}
}
