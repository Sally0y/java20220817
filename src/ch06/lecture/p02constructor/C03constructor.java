package ch06.lecture.p02constructor;

public class C03Constructor {
	public static void main(String[] args) {
		
		// 명시적으로 생성자를 선언하는 이유는 객체를 다양하게 초기화하기 위해서이다.
		
		// 클래스(생성자 = factor, 매개변수 선언) { 객체 초기화 또는 메소드 호출 }
		
		// 매개변수는 생성자를 호출할 때 
			// 외부의 값을 생성자 블록 내부로 전달하는 역할을 한다.
		
		MyClass3 o1 = new MyClass3("iceman", 77);
		System.out.println(o1.name); // "iceman"
		System.out.println(o1.age); // 77
		
		MyClass3 o2 = new MyClass3("maverick", 66);
		System.out.println(o2.name);// "maverick"
		System.out.println(o2.age);// 66
		
//		MyClass3 o3 = new MyClass3(); // x
	}
}
