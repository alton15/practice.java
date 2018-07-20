package 연습;

import java.util.Scanner;

public class iterative_f {
	
	public static int factorial(int number) {	//factorial은 5!이라 한다면 5! = 5 * 4 * 3 * 2 * 1이다.
		int sum = 1;
		for(int i = 2;  i <= number; i++) {		//원래 factorial은 해당 숫자부터 1씩 빼지만 i를 1로 둬서 해당 숫자까지 1씩 올라가면서 sum에 곱해준다.
			sum *= i;
		}
		return sum;		//sum을 return해준다.
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		
		System.out.println("Write the number that you want to factorial");
		number = sc.nextInt();
		
		System.out.println(number + "를(을) factorial한 수는 " + factorial(number) + "입니다.");
		
		sc.close();
	}

}
