package ch04.Exercise;

import java.util.Scanner;

public class Exercise04 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("(주사위 맞추기)");
		
		while (true) {
			System.out.print("번호를 입력하세요(1~6):");
			
			int user = scanner.nextInt();
			
			int d = (int) (Math.random() * 6) + 1;
			int c = (int) (Math.random() * 6) + 1;
			
			System.out.println("주사위 결과 : " + d);
	
			if () {
				System.out.println("맞췄습니다.");
			} else {
				System.out.println("틀렸습니다.");
			}
		}
	}
}
