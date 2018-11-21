package new_practice;

import java.util.Calendar;

public class EnumWeek {
	public static void main(String[] args) {
		Week today = null;
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
			case 1:
				today = Week.Sunday;
				break;
			case 2:
				today = Week.Monday;
				break;
			case 3:
				today = Week.Tuesday;
				break;
			case 4:
				today = Week.Wednesday;
				break;
			case 5:
				today = Week.Thursday;
				break;
			case 6:
				today = Week.Friday;
				break;
			case 7:
				today = Week.Saturday;
				break;
		}
		System.out.println("Today: " + today);
	}
}
