package ch05.lecture.p01array;

public class C08_2ArrayCopy {
	public static void main(String[] args) {
		int[] oldIntArray = {1, 2, 3};
		int[] newIntArray = new int[5];
		
		for(int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		for(int i = 0; i < newIntArray.length; i++) {
			System.out.println(newIntArray[i] + ", ");
		} // 복사되지 않은 항목은 int[] 배열의 기본 초기값인 0이 그대로 유지 됨.
		 //		     //           String[] 배열의 기본 초기값인 null이 그대로 유지 됨.
	}
}
