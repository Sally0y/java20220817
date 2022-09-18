package ch05.book;

public class ArrayCreateByValueListExample1 {
	public static void main(String[] args) {
		int[] scores = {83, 90, 80};
		
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
		
		int sum = 0;
		for(int i =0; i<3; i++) {  //for문을 3번 반복하는 동안
			sum += scores[i];      // score[i]도 세 번 => [0], [1], [2] 
								   //  반복 하면서 합을 구해라.
		}
		System.out.println("총합 : " + sum);
		double avg = (double) sum / 3;
		System.out.println("평균 : " + avg);
	}
}
