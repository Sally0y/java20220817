package ch03.book.exercise;

public class IfnestedExample {
	public static void main(String[] args) {
		// 81<=...<=100 사이에 속하는 점수 
		int score = (int)(Math.random()*20) + 81;
		System.out.println("점수: " + score);
		
		String grade;
		
		if(score>=90) {
			if(score>=95) {
				grade = "A+";
			} else {
				grade = "A";
			} 
			} else {
				if(score>=85) {
					grade = "B+";
				} else {
					grade = "B"
				}
			}
		}
	}
}
