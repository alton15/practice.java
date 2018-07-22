package 연습;

public class 메소드의_매개_변수 {
	public static void main(String[] args) { //args는 run > run configurations... > 프로젝트, 메인 클래스 확인 > arguments > 칸 2개 중에 위에 칸에 넣고 싶은거 넣기 예)10 20 < 띄어쓰기는 [0]에서 [1]로 가는 것.
		if(args.length != 2) {
			System.out.println("사용법");
			System.out.println("java mainstringarrayarguments num1 num2");
			System.exit(0);
		}
		
		String Num1 = args[0];
		String Num2 = args[1];
		
		int num1 = Integer.parseInt(Num1);
		int num2 = Integer.parseInt(Num2);
		
		int re = num1 + num2;
		System.out.println(re);
	}
}
