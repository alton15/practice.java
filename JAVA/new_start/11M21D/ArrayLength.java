package new_practice;

public class ArrayLength {
	public static void main(String[] args) {
		int[] scores = { 80, 90, 100 };
		int sum = 0;
		for(int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		System.out.println("sum: " + sum);
		
		double avg = (double) sum / scores.length;	//(�迭).length == �迭�� ����
		System.out.println("average: " + avg);
	}
}
