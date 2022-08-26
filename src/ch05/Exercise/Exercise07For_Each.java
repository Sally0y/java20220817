package ch05.Exercise;

public class Exercise07For_Each {
	public static void main(String[] args) {
		int max = Integer.MIN_VALUE;
		int[] array = {-1, -5, -3, -8, -2};
		
		for (int array : array) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		
		// 가장 작은 값 구하기
		int min = Integer.MAX_VALUE;
		
		for (int array : array) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		
		System.out.println("max:" + max); // 8
		System.out.println("min:" + min); // 1
	}
}
