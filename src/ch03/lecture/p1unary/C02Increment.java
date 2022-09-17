package ch03.lecture.p1unary;

public class C02Increment {
	public static void main(String[] args) {
		// ++ : 증가연산자(단항)
		// -- : 감소연산자(단항)
		
		int x = 1; // 연산결과는 12, x는 11이됨
		int y = 1; // 연산결과는 11, y의 값은 11로 저장
		int result1 = ++x + 10; //12
		int result2 = y++ + 10; //11
		System.out.println(result1);
		System.out.println(result2);
		
		int i = 10;
		int j = 10;
		
		int k = ++i; // 연산결과는 11, i가 11이됨
		int l = j++; // 연산결과가 10, j가 11이됨
		System.out.println(i);
		System.out.println(j); //11
		
		System.out.println(k);
		System.out.println(l); //10
		
		int m = 10;
		int n = 10;
		
		int o = --m; // 연산결과는 9, m이 9가됨
		int p = n--; // 연산결과는 10, n이 9가 됨
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
		System.out.println(p);
	}
}
