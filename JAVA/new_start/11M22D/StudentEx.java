package prac_class;

public class StudentEx {
	public static void main(String[] args) {
		student s1 = new student();
		System.out.println("s1 변수가 Student 객체를 참조한다.");
		
		student s2;
		s2 = new student();
		System.out.println("s2 변수가 s1과 다른 student 객체를 참조한다.");
	}
}
