package ����;

import java.util.Scanner;

public class Recursive_f {
	
	public static int recursive(int a) {	//����Լ��� factorial ���ϱ�.
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
		
		System.out.println(a + "��(��) factorial�� ���� " + recursive(a) + "�Դϴ�.");
		
		sc.close();
	}
}
