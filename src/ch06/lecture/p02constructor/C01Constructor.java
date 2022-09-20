package ch06.lecture.p02constructor;

public class C01Constructor {
	// 모든 클래스는 생성자가 반드시 존재
	
	// 생성자 역할: 객체 생성 시 초기화 담당
	//            : 메소드 호출하여 객체 사용 준비
	
	// 클래스(생성자 = factor, 매개변수 선언) { 객체 초기화 또는 메소드 호출 }
	
	// 클래스 이름으로 되어 있으며, 리턴 타입이 없음 
	public static void main(String[] args) {
		MyClass1 o1 = new MyClass1();
		o1.name = "maverick";
		
		MyClass1 o2 = new MyClass1();
		o2.name = "hangman";
		
		MyClass1 o3 = new MyClass1();
		o3.name = "bob";
		
		MyClass1 o4 = new MyClass1("pheonix");
		System.out.println(o4.name); // "pheonix"
		
		MyClass1 o5 = new MyClass1("goose");
		System.out.println(o5.name); // "goose"
	}
}







