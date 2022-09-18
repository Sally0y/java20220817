package ch04.book;

public class ForSumFrom1To100Example {
	public static void main(String[] args) {
		int sum = 0; 
		
		int i = 0;     //카운터 변수 ↓  == 수를 세어줌
		for(i = 1; i <= 100; i++) {//↓
			sum += i;			   //↓
		}						   //↓
								   //↓				
		System.out.println("1~" + (i-1) + " 합 : " + sum);
	}					      //카운터 변수 => 101 - 1 = 100
}
