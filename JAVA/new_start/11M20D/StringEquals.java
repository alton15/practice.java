package new_practice;

public class StringEquals {
	public static void main(String[] args) {
		String str1 = "김기강";
		String str2 = "김기강";
		String str3 = new String("김기강");	//new로 생성하면 새로운 String 객체의 번지값을 가지고 있어서
											//비교 연산자를 사용했을 때 false가 나온다.
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str1.equals(str3));		//(변수).equals(비교 대상)
	}
}
