package ch04.lecture.p01control;

public class C08For {
	public static void main(String[] args) {
		//중첩된 for문: 
		/*
		 * 바깥쪽 for문이 실행할 때마다 
		 * 중첩된 for문은 지정된 모든 횟수만큼 반복실행 
		 * 다시 바깥쪽 for문 실행 
		 *  => 바깥쪽 for문의 실행이 끝날때까지 중첩된 for문 지정 횟수 반복 실행 
		 */
		
		System.out.println(1);
		
		for (int j = 0; j < 2; j++) {   
			System.out.print(2 + " ");    
			for (int i = 0; i < 3; i++) {   // 2(j + 3) = 2j + 6
				System.out.print(3);
				System.out.print(4);
			}
		}
		System.out.println();
		System.out.println(5);
	}
}
