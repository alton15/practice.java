package ����;

public class �޼ҵ���_�Ű�_���� {
	public static void main(String[] args) { //args�� run > run configurations... > ������Ʈ, ���� Ŭ���� Ȯ�� > arguments > ĭ 2�� �߿� ���� ĭ�� �ְ� ������ �ֱ� ��)10 20 < ����� [0]���� [1]�� ���� ��.
		if(args.length != 2) {
			System.out.println("����");
			System.out.println("java mainstringarrayarguments num1 num2");
			System.exit(0);
		}
		
		String Num1 = args[0];
		String Num2 = args[1];
		
		int num1 = Integer.parseInt(Num1);
		int num2 = Integer.parseInt(Num2);
		
		int re = num1 + num2;
		System.out.println(re);
	}
}
