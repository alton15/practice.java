package ����;

import java.util.Scanner;

public class iterative_f {
	
	public static int factorial(int number) {	//factorial�� 5!�̶� �Ѵٸ� 5! = 5 * 4 * 3 * 2 * 1�̴�.
		int sum = 1;
		for(int i = 2;  i <= number; i++) {		//���� factorial�� �ش� ���ں��� 1�� ������ i�� 1�� �ּ� �ش� ���ڱ��� 1�� �ö󰡸鼭 sum�� �����ش�.
			sum *= i;
		}
		return sum;		//sum�� return���ش�.
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		
		System.out.println("Write the number that you want to factorial");
		number = sc.nextInt();
		
		System.out.println(number + "��(��) factorial�� ���� " + factorial(number) + "�Դϴ�.");
		
		sc.close();
	}

}
