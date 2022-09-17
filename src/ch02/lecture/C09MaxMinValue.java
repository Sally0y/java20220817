package ch02.lecture;

public class C09MaxMinValue {
	public static void main(String[] args) {
//      자바는 데이터 값을 검사하기 위해 모든 기본 타입에 최대값과 최소값을 상수로 제공
		// boolean과 char는 제외
		
		System.out.println("byte"); // byte의 최대값과 최소값
		System.out.println("최대값:" + Byte.MAX_VALUE);
		System.out.println("최소값:" + Byte.MIN_VALUE);
		
		System.out.println("short"); // short의 최대값과 최소값
		System.out.println("최대값:" + Short.MAX_VALUE);
		System.out.println("최소값:" + Short.MIN_VALUE);
		
		System.out.println("int"); // int의 최대값과 최소값
		System.out.println("최대값:" + Integer.MAX_VALUE);
		System.out.println("최소값:" + Integer.MIN_VALUE);

		System.out.println("long"); // long의 최대값과 최소값
		System.out.println("최대값:" + Long.MAX_VALUE);
		System.out.println("최소값:" + Long.MIN_VALUE);
		
		System.out.println("float"); // float의 최대값과 최소값
		System.out.println("최대값:" + Float.MAX_VALUE);
		System.out.println("최소값:" + Float.MIN_VALUE);
		
		System.out.println("double"); // double의 최대값과 최소값
		System.out.println("최대값:" + Double.MAX_VALUE);
		System.out.println("최소값:" + Double.MIN_VALUE);
	}
}
