package new_practice;

public class ArrayLength {
	public static void main(String[] args) {
		int[] scores = { 80, 90, 100 };
		int sum = 0;
		for(int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		System.out.println("sum: " + sum);
		
		double avg = (double) sum / scores.length;	//(배열).length == 배열의 길이
		System.out.println("average: " + avg);
	}
}
