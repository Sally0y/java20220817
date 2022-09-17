package ch02.lecture;

public class C02Scope {
	public static void main(String[] args) {
		// 변수를 사용한다는 것은 변수에 값을 저장하고 읽는 행위를 말한다.
		
		// 사용범위: 변수는 선언된 블럭{} 내에서만 사용 가능
		int a = 3;
		
		// 초기값과 동시에 변수 선언시 입력된 값을 리터럴(literal)이라고 한다.
		// 리터럴은 상수와 같은 의미지만 구분하여 사용한다.
		// 상수는 "값을 한 번 저장하면 변경할 수 없는 변수"로 정의
		
		
		if (true) {
//			int a = 5; // x
			int b = 4;
			System.out.println(a);
			System.out.println(b);
		}
		System.out.println(a);
//		System.out.println(b); // x : 위에 조건문 블록에서 선언된 변수는 조건문 내에서만 사용 가능
		
		/*
		 * 로컬 변수(메소드 블럭 내에서 선언된 변수)는 
		 * 메소드 실행이 끝나면 메모리에서 자동으로 없어진다.
		 */
	}
}