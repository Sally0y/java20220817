package ch04.book;

public class IfNestedExample {
	public static void main(String[] args) {
		int score = (int)(Math.random()*20 + 81); // 점수는 19+81 = 100중에 랜덤
		System.out.println("점수: " + score);
		
		String grade;
		
		if(score>=90) {            //90이상이 맞으면 → 중첩문 실행  
			if(score>=95) {			//95이상이면 A+			
				grade = "A+";       // 90이상 ~ 95미만이면 A
			} else {
				grade = "A";
			} 
			} else {               //90이상이 아니야? 그럼 → 중첩문 실행 
				if(score>=85) {     // 85이상이면 B+
					grade = "B+";   // 85미만이면 B
			} else {
				grade = "B";
			}
		}
		
		System.out.println("학점: " + grade);
	}
}
