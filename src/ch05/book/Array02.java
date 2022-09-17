package ch05.book;

public class Array02 {
	public static void main(String[] args) {
		int[] arr1 = {9, 8};
		int[] arr2 = {100, 50};
		int[] arr3 = {99, 100, 101};
		
		printLength(arr1); //9
		printLength(arr2); //100
		printLength(arr3); //99
		printLength(new int[] {10000}); //10000
		
		}
	
	public static void printLength(int[] arr) {
		System.out.println(arr.length);
		
	}
	
	
}
