package new_practice;

public class AdvancedFor {
	public static void main(String[] args) {
		int[] scores = { 60, 70, 80, 90, 100 };
		int sum = 0;
			// 타입 변수 : 배열
		for(int score : scores) {
			sum += score;	//실행문
		}
		System.out.println("sum: " + sum);
		
		/*
		 1. 배열에서 가져올 첫 번째 값이 있는지 판단한다.
		 2. 가져올 값이 존재하면 해당 값을 변수에 저장한다.
		 3. 실행문을 실행한다.
		 4. 실행문 끝나면 가져올 값이 있는지 판단, 없으면 종료.
		 	!!**이때 for문의 반복 횟수는 배열의 항목 수**!!
		 */
	}
}