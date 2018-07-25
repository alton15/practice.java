package 연습;

public class Multidimensional_array {

	public static void main(String[] args) {
		int a = 10;
		int[][] arr = new int[a][a];
		
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < a; j++) {
				arr[i][j] = (int)(Math.random() * 10);	//0 ~ 0.???까지의 값을 랜덤으로 만들어준다.
			}
		}
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < a; j++) {
				System.out.print(arr[i][j] + " ");
			}
		}
	}
}