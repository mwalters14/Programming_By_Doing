import java.util.Scanner;

public class WeekdayCalculator {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    int birth_year, birth_month, birth_day;

    System.out.println("What's your birthday? ");
    System.out.print("Birthday (mm dd yyyy) ");

    birth_month = keyboard.nextInt();
    birth_day = keyboard.nextInt();
    birth_year = keyboard.nextInt();

    System.out.println(weekday(birth_month, birth_day, birth_year));
  }

  public static int Offset(int monthNumber) {
    int month_offset = 0;
    if (monthNumber == 1) {
      month_offset = 1;
    } else if (monthNumber == 2) {
      month_offset = 4;
    } else if (monthNumber == 3) {
      month_offset = 4;
    } else if (monthNumber == 4) {
      month_offset = 0;
    } else if (monthNumber == 5) {
      month_offset = 2;
    } else if (monthNumber == 6) {
      month_offset = 5;
    } else if (monthNumber == 7) {
      month_offset = 0;
    } else if (monthNumber == 8) {
      month_offset = 3;
    } else if (monthNumber == 9) {
      month_offset = 6;
    } else if (monthNumber == 10) {
      month_offset = 1;
    } else if (monthNumber == 11) {
      month_offset = 4;
    } else if (monthNumber == 12) {
      month_offset = 6;
    } else {
      month_offset = -1;
    }
    return month_offset;
  }

  public static String weekday(int birth_month, int birth_day, int birth_year) {
    int yy, total;
    String date = "";
    boolean leap = false;

    leap = is_leap(birth_year);
    yy = birth_year - 1900;
    total = yy / 4;
    total += yy;
    total += birth_day;
    total += Offset(birth_month);
    if (leap && birth_month == 1 || birth_month == 2) {
      total -= 1;
    }
    total = total % 7;
    date = weekday_name(total) + ", " + getMonth(birth_month) + " " + birth_day + ", " + birth_year + "!";

    return date;
  }

  public static String weekday_name( int weekday ) {
    String result = "";

    if ( weekday == 1 ){
      result = "Sunday";
    } else if ( weekday == 2 ){
      result = "Monday";
    } else if ( weekday == 3 ) {
      result = "Tuesday";
    } else if ( weekday == 4 ) {
      result = "Wednesday";
    } else if ( weekday == 5 ) {
      result = "Thursday";
    } else if ( weekday == 6 ) {
      result = "Friday";
    } else if ( weekday == 7 ) {
      result = "Saturday";
    } else if ( weekday == 0) {
      result = "Saturday";
    } else {
      result = "Error";
    }

    return result;
  }

  public static String getMonth(int month_number) {
    String month = "";
    if (month_number == 1) {
      month = "January";
    } else if (month_number == 2) {
      month = "Feburary";
    } else if (month_number == 3) {
      month = "March";
    } else if (month_number == 4) {
      month = "April";
    } else if (month_number == 5) {
      month = "May";
    } else if (month_number == 6) {
      month = "June";
    } else if (month_number == 7) {
      month = "July";
    } else if (month_number == 8) {
      month = "August";
    } else if (month_number == 9) {
      month = "September";
    } else if (month_number == 10) {
      month = "October";
    } else if (month_number == 11) {
      month = "November";
    } else if (month_number == 12) {
      month = "December";
    } else {
      month = "I don't have a month for that number.";
    }

    return month;
  }

  public static boolean is_leap( int year ) {
		// years which are evenly divisible by 4 are leap years,
		// but years divisible by 100 are not leap years,
		// though years divisible by 400 are leap years
		boolean result;

		if ( year%400 == 0 )
			result = true;
		else if ( year%100 == 0 )
			result = false;
		else if ( year%4 == 0 )
			result = true;
		else
			result = false;

		return result;
	}
}
