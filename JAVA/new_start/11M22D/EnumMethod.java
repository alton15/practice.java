package new_practice;

public class EnumMethod {
	public static void main(String[] args) {
		//name() �޼ҵ�
		Week today = Week.Sunday;
		String name = today.name();		//���� ��ü�� ���ڿ��� ����
		System.out.println(name);
		System.out.println(today);
		//ordinal() �޼ҵ�
		int ordinal = today.ordinal();
		System.out.println(ordinal);		//���� ��ü�� ������ ���� (0���� ����)
		
		//compareTo() �޼ҵ�				//day1�� day2�� ����� ��ġ ����
		Week day1 = Week.Monday;		//���� 0
		Week day2 = Week.Tuesday;		//���� 1
		int result1 = day1.compareTo(day2);		//0 - 1 = -1
		int result2 = day2.compareTo(day1);		//1 - 0 = 1
		System.out.println(result1);
		System.out.println(result2);
		
		//valueOf() �޼ҵ�
		if(args.length == 1) {
			String day = args[0];
			Week weekDay = Week.valueOf(day);
			if(weekDay == Week.Saturday || weekDay == Week.Sunday) {
				System.out.println("�ָ��̴�.");
			}
			else {
				System.out.println("�����̴�.");
			}
		}
		
		//values() �޼ҵ�
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}
	}
}
