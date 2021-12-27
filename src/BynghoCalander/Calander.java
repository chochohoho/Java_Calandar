package BynghoCalander;

public class Calander {

	private static final int[] MAX_DAYS = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final int[] LEAP_MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	
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
		System.out.println(" SU MO TU WE TH FR SA");
		
		
		int weekdaysnum = getWeekDay(year, month, 1);
		for(int i=0; i<weekdaysnum; i++)
			System.out.print("   ");
		
		int nMaxdays = getmaxDaysofMonth(year, month);
		
		for(int i=1; i <= nMaxdays; i++) {
			System.out.printf("%3d",i);
			
			if((i+weekdaysnum)%7 == 0)
				System.out.println();
		}
		
		System.out.println();
	}

	private int getWeekDay(int year, int month, int day) {
		// TODO Auto-generated method stub
		
		//1970.1.1 (th)
		
		int syear = 1970;
		int smonth = 1;
		int sdays = 1;
		final int STANDARD_WEEKDAY = 4;// thursday
		
		int nCount = 0;
		for(int i = syear; i < year; i++) {
			
			int delta = isLeapYear(i)? 366: 365;
			nCount += delta;
		}
		
		for(int i = 1; i < month; i++) {
			int delta = getmaxDaysofMonth(year, i);
			nCount += delta;
		}
		
		nCount += day -1;
		
		int weekday = (nCount + STANDARD_WEEKDAY) % 7;
		
		return weekday;
	}
	
}
