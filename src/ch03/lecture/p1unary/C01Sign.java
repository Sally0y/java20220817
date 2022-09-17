package ch03.lecture.p1unary;

public class C01Sign {
	public static void main(String[] args) {
		// 연산에 사용되는 표시나 기호 연산자(operator)
		// 연산되는 데이터 피연산자(operand)
		// 부호·증가/감소 연산자(단항), 조건 연산자(삼항)
		// 그 외에 대부분이 이항 연산자
		
		//연산식은 반드시 하나의 값을 산출한다.
		
		// 부호 연산자 +, - (단항 연산자: 피연산자 하나만 요구)
		int i = 3;
		int j = +i;
		System.out.println(j);
		
		int k = -i;
		System.out.println(k);
		
		int l = -k;
		System.out.println(l);
		
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		System.out.println(-Double.MAX_VALUE);
		System.out.println(-Double.MIN_VALUE);
	}
}
