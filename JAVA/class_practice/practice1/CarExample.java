package practice1;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car(); //��ü�� �����Ѵ�.
		
		//�ʵ尪�� �д´�.
		System.out.println("company: " + myCar.company);
		System.out.println("model: " + myCar.model);
		System.out.println("color: " + myCar.color);
		System.out.println("max speed: " + myCar.maxSpeed);
		
		//�ʵ尪�� �����Ѵ�.
		myCar.speed = 80;
		System.out.println("current speed: " + myCar.speed);
		
		if(myCar.model == "320d") {
			System.out.println("!Warning! Your car need to recall.");
		}
	}

}
