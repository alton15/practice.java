package ����;

import java.util.Scanner;

public class array {
	
	public static int max(int a, int b) {
		return (a > b) ? a : b;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �迭�� ũ�⸦ �Է�: ");
		int num = sc.nextInt();
		
		int[] array = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.print("�迭�� �Է��� ������ 1���� �Է��Ͻÿ�: ");
			array[i] = sc.nextInt();
		}
		
		int result = 0;
		for(int i = 0; i < num; i++) {
			result = max(result, array[i]);
		}
		
		System.out.println("�Է��� ��� ���� �߿��� ���� ū ��: " + result);
	}
}
