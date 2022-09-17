package ch04.lecture.p01control;

public class C13Break {
	public static void main(String[] args) {
		
		System.out.println(1);

// (1) Poeing: for(int i = 0; i < 5; i++) {···}	
		for (int i = 0; i < 5; i++) {
			System.out.println(2);
			
			for (int j = 0; j < 5; j++) {
				System.out.println(3);
				if (true) {
					break; // 가장 가까운 loop 종료
			//  (2) break Poeing;
				}
				System.out.println(4);
			}
			
			System.out.println(5);
		}
		
		System.out.println(6);
		
		// 중첩된 ~ 바깥쪽 반복문까지 종료 시키려면
		// 바깥쪽 반복문에 이름을 붙이고 - (1)
		// "break 이름;"을 사용		
	}
}
