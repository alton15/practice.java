package ����;

import java.util.Scanner;

public class input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		
		int i = sc.nextInt(); //sc��� ����� �Լ��� �ܼ�â�� �ԷµǴ� ���� ������ �ް� i�� �־��ش�.
		
		System.out.println("�Էµ� ���� : " + i + "�Դϴ�.");
		
		sc.close(); //sc��� �Լ��� �ݾ��ش�.
	}
}
