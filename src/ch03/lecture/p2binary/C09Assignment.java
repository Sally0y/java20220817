package ch03.lecture.p2binary;

public class C09Assignment {
	public static void main(String[] args) {
		
		// 대입연산자 : =, +=, -=, /=, *=, %=
		// 대입연산자는 모든 연산자 중에서 가장 낮은 연산 순위를 가지고 있음
		// 오른쪽 피연산자의 값을 좌측 피연산자인 변수에 저장
		
		int i = 3;
		int j = 5;
		
		int k = i;
		System.out.println(k); // 3
		
		k += j; // k = k + j;
		System.out.println(k); // 8
		
		k -= i; // k = k - i;
		System.out.println(k); // 5
		
		k *= i; // k = k * i;
		System.out.println(k); // 15
		
		k /= j; // k = k / j;
		System.out.println(k); // 3
		
		k %= i; // k = k % i;
		System.out.println(k); // 0
	}
}








