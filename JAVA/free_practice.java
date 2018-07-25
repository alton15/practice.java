package 연습;

public class 자유_연습 {
	
	final static double pi = 3.14;
	
	public static void main(String[] args) {
		System.out.println(pi);
		
		String k = "단팥빵";
		System.out.println(k);
		k = "abcd efgh";
		System.out.println(k.substring(0, 8));
		
		int a = 5;
		int b = 10;
		System.out.println("a와 b 중에 더 큰	 것은 " + bi(a, b) + "입니다.");
		
		double q = Math.pow(5.0, 5.0);
		System.out.println((int)q);
	}
	static int bi(int a, int b) {
		int result = (a > b) ? a : b;
		return result;
	}
}
