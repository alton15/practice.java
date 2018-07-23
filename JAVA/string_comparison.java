package 연습;

public class 스트링_비교연산자_연습 {
	public static void main(String[] args)
	{
		String a;
		
		a = "앙 기모띵";
		
		System.out.println(a);
		
		a += 5;
		
		System.out.println(a);
		
		boolean no = true;
		
		System.out.println(no);
		
		no = !no;
		
		System.out.println(no);
		
		if(no == true)
			System.out.println("no는 트루입니다.");
		else
			System.out.println("no는 뻘스입니다." + a);
		
		System.out.println(no + " dkd");
		
		int k;
		k = 10;
		
		for(; k > 7; k--)
			System.out.println(k + "\t 1을 빼냈습니다." + " 남은 수는 "+k+"입니다.");
		
		String b = "아니";
		a = " 그렇게 하는 거 아닌데요 ;;";
		
		String c = b + a;
		
		System.out.println(b + a + "\n" + c);
		
		boolean kk = a == b;
		
		System.out.println(kk);
		
		String iq = new String ("a");
		
		String id = "a";
		
		boolean asdf = iq == id;
		
		System.out.println(asdf);
		
		boolean as = id.equals(iq);
		
		System.out.println(as);
	
	}
}
