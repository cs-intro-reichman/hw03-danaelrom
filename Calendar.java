/** 
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar {	

    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	
	public static void main(String args[]) {
		int calendarYear = Integer.parseInt(args[0]);
	 	while (year <= calendarYear) {
	 		if(year == calendarYear){
	 			System.out.print(dayOfMonth + "/" + month + "/" + year);
	 			if(dayOfWeek == 1){
	 				System.out.print(" Sunday");
	 			}
	 			System.out.println();
	 		}
	 		advance();
	 		
        }
	 }
	
	 private static void advance() {
	 	dayOfWeek++;
	 	if(dayOfWeek > 7){
	 		dayOfWeek = 1;
	 	}
		dayOfMonth++;
		if (dayOfMonth > nDaysInMonth) {
			month++;
			if(month > 12){
				year++;
				month = 1;
			}
			dayOfMonth = 1;
			nDaysInMonth = nDaysInMonth(month,year);
		}
	 } 
		 
    // Returns true if the given year is a leap year, false otherwise.
	private static boolean isLeapYear(int year) {
		if(year % 400 == 0 || (year %4 == 0 && year % 100 != 0)){
			return true;
		}
		return false;
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	private static int nDaysInMonth(int month, int year) {
		switch (month) {
			case 4:
			case 6:
			case 9:
			case 11:
				return 30;
			case 2:
				if (isLeapYear(year)){
					return  29;
				} else  {
					return 28;
				}
			default:
				return 31;
		}
	}
}
