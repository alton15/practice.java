
public class better_for {

	public static void main(String[] args) {
		int[] scores = {95, 71, 84, 93, 87};
		
		int sum = 0;
		
		for(int score : scores) { //(배열에서 꺼낸 것을 저장할 번수 : 데이터를 꺼낼 배열)
			sum = sum + score;
		}
		
		System.out.println("점수 총합: " + sum);
		
		double avg = (double) sum / scores.length;
		
		System.out.println("점수 평균 : " + avg);
	}

}
