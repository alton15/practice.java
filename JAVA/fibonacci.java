package fibonacci;

import java.util.Scanner;

public class fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int f1 = 1;
		int f2 = 1;
		int fx;
		
		System.out.print("연산 횟수를 입력하시오(최소 2번) : ");
		int a = sc.nextInt();
		
		System.out.println(f1);
		System.out.println(f2);
		
		for(int i = 2; i < a; i++) {
			fx = f1 + f2;
			System.out.println(fx);
			f1 = f2;
			f2 = fx;
		}
		sc.close();
	}
}
