package ����;

public class �ڷ���_���_���ǹ�1_���� {
	public static void main(String[] args) {
		System.out.println("�ز���"); //���ڿ� ���
		int a = 5;
		int b = 6;
		int empty;
		int c = 17;
		double d = 10.5;
		String k = "�ƴ�";
		
		System.out.println(a); //���� ���
		
		System.out.println(d + a); //�Ǽ� + ���� ���
		
		System.out.println("�� ���� ���� "+a+"�� �� �Դϴ�."); //���ڿ� + ���� ���
		
		System.out.println("�� ���̴� "+c+"�Դϴ�."); //17�ٰ� ����
		
		System.out.println(k); //���ڿ� ���� ���
		
		if(a > b) //if�� ���
		{
			System.out.println("a�� b���� Ů�ϴ�.");
		}
		else
		{
			empty = b - a;
			System.out.println("a�� b���� �۽��ϴ�. ���� a�� b���� ���ų� Ŀ������ "+empty+"��(��) ���ų� ���� ���� ���ؾ��մϴ�.");
		}
		
		switch(a) //switch�� ���
		{
		case 1:
			System.out.println("a�� ���� 1 �Դϴ�.");
			break;
		case 2:
			System.out.println("a�� ���� 2 �Դϴ�.");
			break;
		case 3:
			System.out.println("a�� ���� 3 �Դϴ�.");
			break;
		default:
			System.out.println("a�� ���� 1 ~ 3�� �ƴմϴ�.");
		}
	}
}
