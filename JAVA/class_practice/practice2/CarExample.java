package practice2;

public class CarExample {
	public static void main(String[] args) {
		CarEx car1 = new CarEx("흰색", 2000); //생성자를 선언 했기 때문에 기본 생성자를 호출할 수 없다.
		//Car car1 = new Car(); -> (x)
		CarEx car2 = new CarEx("검은색", 3000);
		
		System.out.println("가격: " + car1.price);
		System.out.println("차 색: " + car1.color);
		System.out.println("cc: " + car1.cc);
		System.out.println("가격: " + car2.price);
		System.out.println("차 색: " + car2.color);
		System.out.println("cc: " + car2.cc);
	}
}
