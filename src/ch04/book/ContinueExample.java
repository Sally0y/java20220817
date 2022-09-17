package ch04.book;

public class ContinueExample {
	public static void main(String[] args) {
//  Continue: 특정 조건을 만족하는 경우 그 이후의 문장을 실행하지 않고 다음 반복으로 넘어감
		
		// 1~10사이의 수 중에서 짝수만 출력하는 코드
		for(int i = 1; i <= 10; i++) {
			
			if(i%2 != 0) {     // 2로 나눈 나머지가 0이 아닐 경우, 즉 홀수인 경우
				
				continue;
			}
			System.out.println(i);  // 홀수는 실행되지 않는다.
		}
	}
}
