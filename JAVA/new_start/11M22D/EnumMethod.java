package new_practice;

public class EnumMethod {
	public static void main(String[] args) {
		//name() 메소드
		Week today = Week.Sunday;
		String name = today.name();		//열거 객체의 문자열을 리턴
		System.out.println(name);
		System.out.println(today);
		//ordinal() 메소드
		int ordinal = today.ordinal();
		System.out.println(ordinal);		//열거 객체의 순번을 리턴 (0부터 시작)
		
		//compareTo() 메소드				//day1과 day2의 상대적 위치 차이
		Week day1 = Week.Monday;		//순번 0
		Week day2 = Week.Tuesday;		//순번 1
		int result1 = day1.compareTo(day2);		//0 - 1 = -1
		int result2 = day2.compareTo(day1);		//1 - 0 = 1
		System.out.println(result1);
		System.out.println(result2);
		
		//valueOf() 메소드
		if(args.length == 1) {
			String day = args[0];
			Week weekDay = Week.valueOf(day);
			if(weekDay == Week.Saturday || weekDay == Week.Sunday) {
				System.out.println("주말이다.");
			}
			else {
				System.out.println("평일이다.");
			}
		}
		
		//values() 메소드
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}
	}
}
