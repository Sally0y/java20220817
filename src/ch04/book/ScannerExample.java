package ch04.book;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫번째 정수 입력 : ");
		int first = scanner.nextInt();
		
		System.out.println("마지막 정수 입력 (1보다 큰수)");
		int last = scanner.nextInt();
		
		int sum = 0;
		
		for (int i = 1; i <= last; i++) {
			sum +=i;
		}
		
		System.out.println("1부터 " + last + "까지 합" + sum);
	}
}
