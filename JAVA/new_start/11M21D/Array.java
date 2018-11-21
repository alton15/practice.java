package new_practice;

public class Array {
	public static void main(String[] args) {
		String[] arr1 = { "±è", "±â°­" };
		
		for(int i = 0; i < 2; i++) {
			System.out.println(arr1[i]);
		}
		
		String[] arr2;
		arr2 = new String[] { "±è", "±â°­" };
		
		for(int i = 0; i < 2; i++) {
			System.out.println(arr2[i]);
		}
		
		String[] arr3 = new String[2];
		arr3[0] = "±è";
		arr3[1] = "±â°­";
		
		for(int i = 0; i < 2; i++) {
			System.out.println(arr3[i]);
		}
		
		String a = "±è±â°­";
		String b = new String("±è±â°­");
		System.out.println( a == b );
		
	}
}
