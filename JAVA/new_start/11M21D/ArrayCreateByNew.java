package new_practice;

public class ArrayCreateByNew {
	public static void main(String[] args) {
		int[] arr1 = new int[3];
		for(int i = 0; i < 3; i++) {
			System.out.println("arr1[" + i + "]: " + arr1[i]);
		}
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for(int i = 0; i < 3; i++) {
			System.out.println("arr1[" + i + "]: " + arr1[i]);
		}
		
		double[] arr2 = new double[3];
		for(int i = 0; i < 3; i++) {
			System.out.println("arr2[" + i + "]: " + arr2[i]);
		}
		arr2[0] = 1.1;
		arr2[1] = 2.2;
		arr2[2] = 3.3;
		for(int i = 0; i < 3; i++) {
			System.out.println("arr2[" + i + "]: " + arr2[i]);
		}
		
		String[] arr3 = new String[3];
		for(int i = 0; i < 3; i++) {
			System.out.println("arr3[" + i + "]: " + arr3[i]);
		}
		arr3[0] = "±è±â°­";
		arr3[1] = "°øºÎÇØ";
		arr3[2] = "³îÁö¸¶";
		for(int i = 0; i < 3; i++) {
			System.out.println("arr3[" + i + "]: " + arr3[i]);
		}
	}
}
