package new_practice;

public class StringEquals {
	public static void main(String[] args) {
		String str1 = "��Ⱝ";
		String str2 = "��Ⱝ";
		String str3 = new String("��Ⱝ");	//new�� �����ϸ� ���ο� String ��ü�� �������� ������ �־
											//�� �����ڸ� ������� �� false�� ���´�.
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str1.equals(str3));		//(����).equals(�� ���)
	}
}
