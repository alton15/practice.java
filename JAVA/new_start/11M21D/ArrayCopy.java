package new_practice;

public class ArrayCopy {
	public static void main(String[] args) {
		//for������ �迭 ����
		int[] oldArr = { 1, 2, 3 };
		int[] newArr = new int[5];
		
		for(int i = 0; i < oldArr.length; i++) {
			newArr[i] = oldArr[i];
		}
		for(int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + " ");
		}
		System.out.println();
		
		/************************************/
		
		//System.arraycopy()�� �迭 ����
		String[] oldArray = { "��", "��", "��" };
		String[] newArray = new String[5];
				//���� �迭, ���� ������ �ε���, �� �迭, �� �迭�� ���� ���� �ε���, ������ ����
		System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
		for(int i = 0; i < newArray.length; i++) {
			System.out.print(newArray[i] + " ");
		}
	}
}
