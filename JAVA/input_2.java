package ����;

import java.util.Scanner;

public class input_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		int score;
		
		System.out.print("�л� �̸��� �Է��Ͻÿ�: ");
		name = sc.next(); //.nextLine�� ���ڿ� ��ü�� �Է¹޴´�. //.next�� ���� ���������� ���ڿ��� �޴´�.
		
		System.out.print("������ �Է��Ͻÿ�: ");
		score = sc.nextInt(); //int���� �޴´�.
		
		System.out.println(name + " : " + score);
		
		sc.close();
	}
}
