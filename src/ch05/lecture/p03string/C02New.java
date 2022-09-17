package ch05.lecture.p03string;

public class C02New {
	public static void main(String[] args) {
		String s1 = "java"; // 리터럴이 동일하다면
		String s2 = "java";  // 같은 객체(stack)를(을) 공유하도록 되어 있다.
		
		System.out.println(s1==s2); // true
		
		// But, new 연산자 사용시 같은 객체 공유하지 않아도 됨!
		// new 연산자 : 새 인스턴스(객체)의 참조값을 연산결과로 낸다
		String str1 = new String("java");
		String str2 = new String("java");
		
		System.out.println(str1==str2); // false
		
		String str3 = "java"; // new 연산자 생략하고 string literal
		// new 연산자 생략하고 string literal을 작성하면 이미 있는 참조값 활용
		String str4 = "java"; 
		
		// == 는 객체 비교
		System.out.println(str3==str1); // false  
		
		// equals()메소드는 객체 상관없이 문자열만 비교
		System.out.println(str3.equals(str1)); // true
		
	}
}
