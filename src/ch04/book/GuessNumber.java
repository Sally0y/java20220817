package ch04.book;

import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		//컴퓨터 1~100까지 랜덤 Math.random
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("(숫자 맞추기)");
		System.out.print("번호를 입력하세요(1~100):");
		
		int user = scanner.nextInt();
		
		int d = (int) (Math.random() * 100) + 1;
		
		System.out.println("결과 : " + d);

		if (user == d) {
			System.out.println("맞췄습니다.");
		} else  {
			System.out.println("틀렸습니다.");
		}
	}
}
		
		
	}
}
