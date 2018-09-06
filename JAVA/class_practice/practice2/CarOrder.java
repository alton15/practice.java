package practice2;

import java.util.Scanner;

public class CarOrder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int h;
			System.out.println("1. 차 견적");
			System.out.println("2. 종료");
			System.out.print("원하는 메뉴를 선택: ");
			h = sc.nextInt();
			if(h == 1) {
				//Order();
			}
			else if(h == 2) {
				break;
			}
			else {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
		}
		sc.close();
	}
	/*public static void Order() {
		Scanner sc2 = new Scanner(System.in);
		int a;
		System.out.println("NULL");
		System.out.println(a = sc2.nextInt());
		sc2.close();*/
	}
}
