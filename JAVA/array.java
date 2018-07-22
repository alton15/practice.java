package 연습;

import java.util.Scanner;

public class array {
	
	public static int max(int a, int b) {
		return (a > b) ? a : b;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("만들 배열의 크기를 입력: ");
		int num = sc.nextInt();
		
		int[] array = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.print("배열에 입력할 정수를 1개씩 입력하시오: ");
			array[i] = sc.nextInt();
		}
		
		int result = 0;
		for(int i = 0; i < num; i++) {
			result = max(result, array[i]);
		}
		
		System.out.println("입력한 모든 정수 중에서 가장 큰 수: " + result);
	}
}
