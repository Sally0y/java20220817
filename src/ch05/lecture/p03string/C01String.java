package ch05.lecture.p03string;

public class C01String {
	// 그림: 06문자열.png
	public static void main(String[] args) {
		int a = 3;
		int b = 3;
		
		System.out.println(a == b); // true
		
		// 문자열은 String 객체로 생성되고 (여기서 java, ja 등) = stack 
		// 변수는 String 객체를 참조한다. (여기서 s1, s2 등) = heap
		String s1 = "java"; // 리터럴이 동일하다면
		String s2 = "java";  // 같은 객체(stack)를(을) 공유하도록 되어 있다.
		String s3 = "ja";
		String s4 = "va";
		String s5 = s3 + s4; // "java"
		
		
		System.out.println(s1); // "java"
		System.out.println(s5); // "java"
		
		System.out.println(s1 == s2); // true
		System.out.println(s1 == s5); // false
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		
		System.out.println(System.identityHashCode(s5));
		
		// string content 비교
		System.out.println(s1.equals(s5)); // true
		System.out.println(s1.contentEquals(s5)); // true
		
	}
}





