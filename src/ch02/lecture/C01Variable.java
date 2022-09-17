package ch02.lecture;

public class C01Variable {
	public static void main(String[] args) {
		// 변수: 값을 저장할 수 있는 공간의 이름
		// 다양한 타입의 값을 저장할 수 없다. (ex) int String a; - x
		// 변수 선언: 타입 변수명; 
		
		int a;  // a라는 int 타입 변수 선언
		a = 3;  // a변수에 3을 대입(값 할당)
		
		int b = 3; //b라는 int 타입 변수 선언 및 값 할당
		
		// 변수명 작성 규칙
		// 사용할 수 있는 문자 : 영어대소문자, 숫자, $, _
		// 숫자로 시작할 수 없음
		// 키워드(예약어) 사용하면 안됨
		// 같은 이름의 변수명 재선언 안됨

//		위에 선언한 int b;와 같이 같은 변수명 사용 안됨
				
		int c;
		int $; 
//		int _; // x
		int _a; 
		int A; 
		int C;
//		int 3; // x
		int a3;
				
		// 변수명 작성 관습: lowerCamelCase
		// 의미를 쉽게 알 수 있는 변수명 작성 => 관습
		
		int studentNumber;
		int yourCar;
		int MyCar; // x
		int our_home; // x
	}
}
