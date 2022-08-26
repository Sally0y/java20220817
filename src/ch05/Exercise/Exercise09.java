package ch05.Exercise;

import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 3;
		int[] scores = {85, 95, 93};
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------------------------------------");
			System.out.println("1. 학생수 | 2.점수입력 | 3. 점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------------------");
			System.out.println("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				System.out.println(studentNum);
			} else if(selectNo == 2) {
				
				System.out.println("scores [" + i + "]>");
			} else if(selectNo == 3) {
				
			} else if(selectNo == 4) {
				
			} else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}
