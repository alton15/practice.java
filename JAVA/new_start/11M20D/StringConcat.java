package new_practice;

public class StringConcat {
	public static void main(String[] args) {
		String str1 = "Java";
		
		String str2 = str1 + 3 + 6;		//+연산자를 쓸 때 문자열이 앞에 나오면 문자열 연결 연산자가 된다.
		String str3 = 3 + 6 + str1;
		
		System.out.println(str2);
		System.out.println(str3);
	}
}
