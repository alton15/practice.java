package 연습;

import java.util.Scanner;

public class input_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		int score;
		
		System.out.print("학생 이름을 입력하시오: ");
		name = sc.next(); //.nextLine은 문자열 전체를 입력받는다. //.next는 공백 이전까지의 문자열을 받는다.
		
		System.out.print("점수를 입력하시오: ");
		score = sc.nextInt(); //int형을 받는다.
		
		System.out.println(name + " : " + score);
		
		sc.close();
	}
}
