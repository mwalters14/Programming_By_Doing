public class MonthName {
  public static void main(String[] args) {
    System.out.println( "Month 1: " + getMonth(1) );
    System.out.println( "Month 2: " + getMonth(2) );
    System.out.println( "Month 3: " + getMonth(3) );
    System.out.println( "Month 4: " + getMonth(4) );
    System.out.println( "Month 5: " + getMonth(5) );
    System.out.println( "Month 6: " + getMonth(6) );
    System.out.println( "Month 7: " + getMonth(7) );
    System.out.println( "Month 8: " + getMonth(8) );
    System.out.println( "Month 9: " + getMonth(9) );
    System.out.println( "Month 10: " + getMonth(10) );
    System.out.println( "Month 11: " + getMonth(11) );
    System.out.println( "Month 12: " + getMonth(12) );
    System.out.println( "Month 43: " + getMonth(43) );
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
}
