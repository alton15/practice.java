package ����;

public class �迭 {
	public static void main(String[] args) {
		int a[] = {1, 2, 3, 4};
		String b[] = {"�ƴ� ", "�װ� ", "�׷��� ", "�ϴ°� ", "�ƴѵ� "};
		int i, sum = 0;
		
		for(i = 0; i < 4; i++) {
			sum += a[i];
		}
		
		System.out.println(sum);
		
		for(i = 0; i < 5; i++) {
			System.out.print(b[i]);
		}
		
		i = a.length;
		
		System.out.println(i);
	}
}
