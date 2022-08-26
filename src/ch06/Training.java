package ch06;

public class Training {
public static void main(String[] args) {
	int [] arrayTest = new int [10];
	
	for(int i = 0; i < 10; i++) {
		arrayTest[i] = (i+1);
	
	}
	
	for(int i = 0; i < arrayTest.length; i++) {
		System.out.println(arrayTest[i] + "\t");
	}
}
}
