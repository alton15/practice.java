package prac_class;

public class CarEx {
	public static void main(String[] args) {
		Car myCar = new Car();		//��ü ����
		
		System.out.println("ȸ���: " + myCar.company);		//�ʵ尪 �о����
		System.out.println("�𵨸�: " + myCar.model);
		System.out.println("����: " + myCar.color);
		System.out.println("�ְ� �ӵ�: " + myCar.maxSpeed);
		System.out.println("�� �ӵ�: " + myCar.speed);
		
		myCar.speed = 70;		//�ʵ尪 ����
		System.out.println("�ǽð� �ӵ�: " + myCar.speed);
	}
}
