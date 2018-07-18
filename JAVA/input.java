package 연습;

import java.util.Scanner;

public class input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		
		int i = sc.nextInt(); //sc라는 입출력 함수가 콘솔창에 입력되는 다음 정수를 받고 i에 넣어준다.
		
		System.out.println("입력된 정수 : " + i + "입니다.");
		
		sc.close(); //sc라는 함수를 닫아준다.
	}
}
