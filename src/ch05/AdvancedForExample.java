package ch05;

public class AdvancedForExample {
	int[] scores = {95, 71, 84, 93, 87};
	
	int sum = 0;
	for(int scores : scores) {
		sum = sum + scores;
	}
}
