package ����;

public class ����_���� {
	
	final static double pi = 3.14;
	
	public static void main(String[] args) {
		System.out.println(pi);
		
		String k = "���ϻ�";
		System.out.println(k);
		k = "abcd efgh";
		System.out.println(k.substring(0, 8));
		
		int a = 5;
		int b = 10;
		System.out.println("a�� b �߿� �� ū	 ���� " + bi(a, b) + "�Դϴ�.");
		
		double q = Math.pow(5.0, 5.0);
		System.out.println((int)q);
	}
	static int bi(int a, int b) {
		int result = (a > b) ? a : b;
		return result;
	}
}
