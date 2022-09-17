package ch04.lecture.p01control;

public class C06For {
	public static void main(String[] args) {
		
		System.out.println(1);
		
		// (언제가는 끝날) 반복문
		// 실행흐름
		// 1 -> 2  -true->  3 -> 4  -loop->  2
		//         -false-> for문 종료
		
		for (int i = 1   ;  // 1.초기값(처음값)
				
			 i <= 3	;     // 2.조건식(~하는 동안) : 순환을 마치게 되는 조건
				
			 i++	    // 4.증감식: 순환 할때마다 해야할 것
				) {    // 3. 실행문(코드블럭)
			
			System.out.println(2);
			System.out.println(3);
		}
		
		System.out.println(4);
		
	}
}
