package new_practice;

public class ArrayReferenceObject {
	public static void main(String[] args) {
		String[] strArray = new String[3];
		strArray[0] = "±è±â°­";
		strArray[1] = "±è±â°­";
		strArray[2] = new String("±è±â°­");
		
		System.out.println(strArray[0] == strArray[1]);
		System.out.println(strArray[0] == strArray[2]);
		System.out.println(strArray[0].equals(strArray[2]));
	}
}