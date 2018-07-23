package 연습;

public class 조건문2_연습 {
	public static void main(String[] args) {
		int i, j;
		int a = 2, c = 0;
		int b = 0;
		
		for(i = 0; i < 5; i++)	//for문 사용
		{
			for(j = 0; j < i; j++)
			{
				System.out.printf("* ");
			}
			System.out.printf("\n");
		}
		
		while(a < 10)	//while 사용
		{
			a++;
			c++;
		}
		System.out.printf("a에 1을 %d만큼 더하면 10이 됩니다.\n", c);
		
		c = 0;
		
		while(true) //C언어에서는 (1)이지만 여기선 (true)다.
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
