package ����;

public class ���ǹ�2_���� {
	public static void main(String[] args) {
		int i, j;
		int a = 2, c = 0;
		int b = 0;
		
		for(i = 0; i < 5; i++)	//for�� ���
		{
			for(j = 0; j < i; j++)
			{
				System.out.printf("* ");
			}
			System.out.printf("\n");
		}
		
		while(a < 10)	//while ���
		{
			a++;
			c++;
		}
		System.out.printf("a�� 1�� %d��ŭ ���ϸ� 10�� �˴ϴ�.\n", c);
		
		c = 0;
		
		while(true) //C������ (1)������ ���⼱ (true)��.
		{
			b += c;
			c++;
			if(c > 100)
			{
				break;
			}
		}
		System.out.println(b);
	}
}
