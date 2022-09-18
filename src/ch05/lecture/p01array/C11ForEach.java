package ch05.lecture.p01array;

public class C11ForEach {
	public static void main(String[] args) {
		// 향상된 for (enhanced for, for-each)
		// 배열 및 컬렉션 항목의 개수만큼 반복하고, 자동적으로 for문을 빠져나간다.
		
		int[] a = {5, 7, 9, 11};
		
		// for문의 반복횟수는 배열의 항목 수가 된다.
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		// 4번(= 배열의 항목 수) 반복
		System.out.println("향상된 FOR");
		for (int item : a) {
			System.out.println(item);
		}
	}
}








