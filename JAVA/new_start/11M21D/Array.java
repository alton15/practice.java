package new_practice;

public class Array {
	public static void main(String[] args) {
		String[] arr1 = { "��", "�Ⱝ" };
		
		for(int i = 0; i < 2; i++) {
			System.out.println(arr1[i]);
		}
		
		String[] arr2;
		arr2 = new String[] { "��", "�Ⱝ" };
		
		for(int i = 0; i < 2; i++) {
			System.out.println(arr2[i]);
		}
		
		String[] arr3 = new String[2];
		arr3[0] = "��";
		arr3[1] = "�Ⱝ";
		
		for(int i = 0; i < 2; i++) {
			System.out.println(arr3[i]);
		}
		
		String a = "��Ⱝ";
		String b = new String("��Ⱝ");
		System.out.println( a == b );
		
	}
}
