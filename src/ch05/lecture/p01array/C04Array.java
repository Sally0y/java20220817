package ch05.lecture.p01array;

public class C04Array {
	public static void main(String[] args) {
		// 참조타입 거의 == 객체
		int[] arr1 = {9, 8, 7}; // 길이 = 3, 인덱스 = [0],[1],[2]
		
		// length 속성(attribute, field, property)
		System.out.println(arr1.length);
		
		int[] arr2 = {1, 2, 3, 4, 5};
		System.out.println(arr2.length);
		
		int[] arr3 = {};
		System.out.println(arr3.length);
		
		//배열 인덱스[] 범위 = 0 ~ (길이-1)
		System.out.println(arr1[arr1.length - 1]);
		System.out.println(arr2[arr2.length - 1]);
//		System.out.println(arr3[arr3.length - 1]);
		
		System.out.println("프로그램 계속 실행");
	}
}






