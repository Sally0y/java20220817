package ch03.lecture.p3ternary;

public class C01Ternary {
	public static void main(String[] args) {
		// 삼항 연산자(?:)
		// 조건식 ? 값 또는 연산식 : 값 또는 연산식
		// (1항 = 피연산자1) ? (2항 = 피연산자2) : (3항 = 피연산자)
		// 연산결과 1항 ? (true) -> 2항 : (false) -> 3항
		
		System.out.println(true ? 3 : 2); // 3
		System.out.println(false ? 3 : 2); // 2
		
		
	}
}
