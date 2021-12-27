package BynghoCalander;

public class Calander {

	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30 };
	private static final int[] LEAP_MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30 };

	
	public boolean isLeapYear(int year) {	
		if(year%4 == 0 && (year % 100 != 0 || year % 400 != 0))
			return true;
		else
			return false;
	}
	
	public int getmaxDaysofMonth(int nyear, int nMonth) {

		if(isLeapYear(nyear))
			return LEAP_MAX_DAYS[nMonth -1 ];
		else
			return MAX_DAYS[nMonth - 1];
	}

	public void printDays(int year, int month, int weekday) {
		
		System.out.printf("    <<%4d %3d>>    \n", year, month);
		System.out.println("  일  월  화  수  목  금  토");
		
		for(int i=0; i<weekday; i++)
			System.out.print("    ");
		
		int nMaxdays = getmaxDaysofMonth(year, month);
		
		for(int i=1; i <= nMaxdays; i++) {
			System.out.printf("%3d ",i);
			
			if((i+weekday)%7 == 0)
				System.out.println();
		}
		
		System.out.println();
	}
}
