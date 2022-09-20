package ch06.lecture.p01field;
// 클래스에는 객체가 가져야 할 구성 멤버가 선언된다.
public class C03Field {
	public static void main(String[] args) {
		//field: 객체의 데이터가 저장되는 곳
		
		//필드는 생성자와 메소드 블럭 안( in { } )을 제외하고는 어느 위치에서든 사용 가능,
			// + 객체가 소멸되지 않는  한 객체와 함께 존재
		
		//필드 선언시 생성자와 메소드 내에서 변경 가능
			// 변수는 블럭 안에서만 변경 가능
		
		MyClass2 o1 = new MyClass2(); // => 생성자 선언 without {}
		
		o1.name = "java";  // => 필드!!! =/= 변수
 		o1.color = "blue";
		o1.age = 90;
		o1.score = 3.14;
		
		System.out.println(o1.name);
		System.out.println(o1.color);
		System.out.println(o1.age);
		System.out.println(o1.score);
		
		MyClass2 o2 = new MyClass2();
		
		o2.name = "maverick";
		o2.color = "black";
		o2.age = 50;
		o2.score = 99.9;
		
		System.out.println(o2.name);
		System.out.println(o2.color);
		System.out.println(o2.age);
		System.out.println(o2.score);
		
		MyClass2 o3 = o1;
		
		System.out.println(o3.name);
		System.out.println(o3.score);
	}
}






