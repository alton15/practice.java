package 연습;

public class 배열 {
	public static void main(String[] args) {
		int a[] = {1, 2, 3, 4};
		String b[] = {"아니 ", "그거 ", "그렇게 ", "하는거 ", "아닌데 "};
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
