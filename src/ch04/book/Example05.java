package ch04.book;

public class Example05 {
	public static void main(String[] args) {
		System.out.println("======================");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("=====================");
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("====================");
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("====================");
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j >= 0; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("=====================");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("====================");
		for (int i = 0; i < 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("=====================");
		int a = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j <= i ; j++) {
				System.out.print(a);
				a++;
			}
			System.out.println();
		}
		
		System.out.println("====================");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("================");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= (5-i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("===============");
		int x = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j <= i ; j++) {
				System.out.print(x);
				x++;
			}
			System.out.println();
		}
		}
	
	

	
	}
