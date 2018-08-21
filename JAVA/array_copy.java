package ¿¬½À;

public class array_copy {
	public static void main(String[] args) {
		int[] oldIntA = {1, 2, 3};
		int[] newIntA = new int[5];
		
		for(int i = 0; i < oldIntA.length; i++) {
			newIntA[i] = oldIntA[i];
		}
		
		for(int i = 0; i < newIntA.length; i++) {
			System.out.print(newIntA[i] + " ");
		}
	}
}
