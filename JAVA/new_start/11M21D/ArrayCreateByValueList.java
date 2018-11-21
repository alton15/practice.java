package new_practice;

public class ArrayCreateByValueList {
	public static void main(String[] args) {
		int[] score = { 10 };
		int[] scores;
		System.out.println(score[0]);
		scores = new int[] { 80, 90, 100 };
		int sum1 = 0;
		for(int i = 0; i < 3; i++) {	//scores의 배열의 인덱스는 0, 1, 2이기 때문에
			sum1 += scores[i];
		}
		System.out.println("scores sum: " + sum1);
		
		int sum2 = add( new int[] { 80, 90, 100 } );
		System.out.println("sum: " + sum2);
	}
	
	public static int add(int[] scores) {
		int sum = 0;
		for(int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		return sum;
	}
}
