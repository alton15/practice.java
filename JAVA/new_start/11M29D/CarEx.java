package prac_class;

public class CarEx {
	public static void main(String[] args) {
		Car myCar = new Car();		//객체 생성
		
		System.out.println("회사명: " + myCar.company);		//필드값 읽어오기
		System.out.println("모델명: " + myCar.model);
		System.out.println("색깔: " + myCar.color);
		System.out.println("최고 속도: " + myCar.maxSpeed);
		System.out.println("현 속도: " + myCar.speed);
		
		myCar.speed = 70;		//필드값 변경
		System.out.println("실시간 속도: " + myCar.speed);
	}
}
