package ch05.lecture.p03string;

public class C03Null {
	public static void main(String[] args) {
		int[] a; 
		String b;
		String c = "java";
		
		// 힙 영역의 객체를 참조하고 있지 않다는 뜻
//		a = null; // 참조하는 객체가 없음
		b = null; // 참조하는 객체가 없음 but, null값 선언
		
//		System.out.println(a); // Null로 인한 컴파일 에러
		System.out.println(b); // Null값이 출력
		
		System.out.println(c.length());
//		System.out.println(b.length()); // NullPointerException 
	}
}
