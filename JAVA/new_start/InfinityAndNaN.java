package new_practice;

public class InfinityAndNaN {
	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		
		double z = x / y;		//���� �ϰ� ���� ������ �A ���� �ּ�ó���� ���ش�.
		//double z = x % y;
		
		System.out.println(Double.isInfinite(z));	//���� infinity���� Ȯ��
		System.out.println(Double.isNaN(z));	//���� Nan���� Ȯ��
		
		if(Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("���� ���� �� �� �����ϴ�.");
		}
		else {
			System.out.println(z + 2);
		}
	}
}
