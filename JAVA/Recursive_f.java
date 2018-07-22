package 연습;

import java.util.Scanner;

public class Recursive_f {
	
	public static int recursive(int a) {	//재귀함수로 factorial 구하기.
		if(a == 1) {
			return 1;
		}
		else {
			return a * recursive(a - 1);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		
		System.out.println("Write the number that you want to factorial");
		a = sc.nextInt();
		
		System.out.println(a + "를(을) factorial한 수는 " + recursive(a) + "입니다.");
		
		sc.close();
	}
}
