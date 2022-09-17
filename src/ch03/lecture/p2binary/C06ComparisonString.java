package ch03.lecture.p2binary;

public class C06ComparisonString {
	public static void main(String[] args) {
		// String 끼리 비교 크기 연산(<, <=, >, >=) 안됨 
		String a = "hello";
		String b = "hi";
		
//		System.out.println(a < b); // x
		
		// String 끼리 같은 지 비교 연산 (==, !=)
		// ==은 주소의 값을 비교합니다.(Call By Reference)
		// 주소의 값이란 실제 내용의 값이 아닌 자료의 위치의 값이라고 생각
		
		// equals 메소드 쓰기
		// equals() 메소드는 객체끼리 내용 비교합니다.(Call By value)
		String c = "java";
		String d = "java";
		String e = "ja";
		String f = "va";
		String g = e + f; // "java"
		
		System.out.println(c == d); // true
		System.out.println(c == g); // false
		
		System.out.println(c.equals(d)); // true
		System.out.println(c.equals(g)); // true
		
	}
}








