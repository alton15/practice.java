package practice2;

public class CarExample {
	public static void main(String[] args) {
		CarEx car1 = new CarEx("���", 2000); //�����ڸ� ���� �߱� ������ �⺻ �����ڸ� ȣ���� �� ����.
		//Car car1 = new Car(); -> (x)
		CarEx car2 = new CarEx("������", 3000);
		
		System.out.println("����: " + car1.price);
		System.out.println("�� ��: " + car1.color);
		System.out.println("cc: " + car1.cc);
		System.out.println("����: " + car2.price);
		System.out.println("�� ��: " + car2.color);
		System.out.println("cc: " + car2.cc);
	}
}
