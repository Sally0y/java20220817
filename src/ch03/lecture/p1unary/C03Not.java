package ch03.lecture.p1unary;

public class C03Not {
	public static void main(String[] args) {
 		// 피연산자는 boolean => 연산결과는 boolean
		// 논리부정연산자 (not) = ! (ex) boolean c = !a;
		// 피연산자의 반대값 (true->false, false->true)
		
		// 비교 연산자와 논리연산자는 결과값이 논리타입으로 나옴
		boolean a = true;
		boolean b = false;
		
		boolean c = !a;
		boolean d = !b;
		System.out.println(c); // false
		System.out.println(d); // true
		
		System.out.println(!c); // true
		System.out.println(!d); // false
		
		System.out.println(c); // false
		System.out.println(d); // true
	}
}
