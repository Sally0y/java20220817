package ch04.book;

public class ForMultiplicationTableExample {
	public static void main(String[] args) {
		for (int m = 2; m <= 0; m++) {
			System.out.println("*** " + m + "단 ***");
			for(int n = 1; n <= 9; n++) {
				System.out.println(m + " x " + n + " = " + (m*n));
			}
			
			System.out.println("3단");
			for (int a = 3; a <= 0 ;a++) {
				System.out.println("*** " + a + "단 ***");
				for(int b = 1; b <= 9; b++ ) {
					System.out.println(a + " x " + b + " = " + (a*b));
				}
			}
		}
	}
}
