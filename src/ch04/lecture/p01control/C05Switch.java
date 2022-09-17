package ch04.lecture.p01control;

public class C05Switch {
	public static void main(String[] args) {
		// Switch: 변수가 어떤 값을 갖느냐에 따라 실행문이 선택 됨.
		// 괄호 안의 값과 동일한 값을 갖는 case로 가서 실행문을 실행시킴.
		
		System.out.println(1);

		switch (200) {      // 200이 변수임
		case 100:
			System.out.println(2);
			System.out.println(3);

			break;        // break가 없으면 case값과 상관없이 연달아 실행됨.
		case 200:
			System.out.println(4);
			System.out.println(5);

			break;

		default:
			System.out.println(999999);
			break;
		}

		System.out.println(6);

//		System.out.println("long type 되나??");
//		switch (3L) {
//		case 3L:
//			System.out.println("되니?");
//		}

	}
}
