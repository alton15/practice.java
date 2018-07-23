package 연습;

public class 자료형_출력_조건문1_연습 {
	public static void main(String[] args) {
		System.out.println("준꼬삼"); //문자열 출력
		int a = 5;
		int b = 6;
		int empty;
		int c = 17;
		double d = 10.5;
		String k = "아니";
		
		System.out.println(a); //정수 출력
		
		System.out.println(d + a); //실수 + 정수 출력
		
		System.out.println("내 점심 값은 "+a+"만 원 입니다."); //문자열 + 정수 출력
		
		System.out.println("제 나이는 "+c+"입니다."); //17줄과 동일
		
		System.out.println(k); //문자열 변수 출력
		
		if(a > b) //if문 사용
		{
			System.out.println("a는 b보다 큽니다.");
		}
		else
		{
			empty = b - a;
			System.out.println("a는 b보다 작습니다. 만약 a가 b보다 같거나 커지려면 "+empty+"과(와) 같거나 높은 수를 더해야합니다.");
		}
		
		switch(a) //switch문 사용
		{
		case 1:
			System.out.println("a의 값은 1 입니다.");
			break;
		case 2:
			System.out.println("a의 값은 2 입니다.");
			break;
		case 3:
			System.out.println("a의 값은 3 입니다.");
			break;
		default:
			System.out.println("a의 값은 1 ~ 3이 아닙니다.");
		}
	}
}
