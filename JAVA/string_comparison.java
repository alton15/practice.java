package ����;

public class ��Ʈ��_�񱳿�����_���� {
	public static void main(String[] args)
	{
		String a;
		
		a = "�� ����";
		
		System.out.println(a);
		
		a += 5;
		
		System.out.println(a);
		
		boolean no = true;
		
		System.out.println(no);
		
		no = !no;
		
		System.out.println(no);
		
		if(no == true)
			System.out.println("no�� Ʈ���Դϴ�.");
		else
			System.out.println("no�� �����Դϴ�." + a);
		
		System.out.println(no + " dkd");
		
		int k;
		k = 10;
		
		for(; k > 7; k--)
			System.out.println(k + "\t 1�� ���½��ϴ�." + " ���� ���� "+k+"�Դϴ�.");
		
		String b = "�ƴ�";
		a = " �׷��� �ϴ� �� �ƴѵ��� ;;";
		
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
