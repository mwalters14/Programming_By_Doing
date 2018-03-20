public class MonthOffset {
  public static void main(String[] args) {
    System.out.println( "Offset for month 1: " + Offset(1) );
		System.out.println( "Offset for month 2: " + Offset(2) );
		System.out.println( "Offset for month 3: " + Offset(3) );
		System.out.println( "Offset for month 4: " + Offset(4) );
		System.out.println( "Offset for month 5: " + Offset(5) );
		System.out.println( "Offset for month 6: " + Offset(6) );
		System.out.println( "Offset for month 7: " + Offset(7) );
		System.out.println( "Offset for month 8: " + Offset(8) );
		System.out.println( "Offset for month 9: " + Offset(9) );
		System.out.println( "Offset for month 10: " + Offset(10) );
		System.out.println( "Offset for month 11: " + Offset(11) );
		System.out.println( "Offset for month 12: " + Offset(12) );
		System.out.println( "Offset for month 43: " + Offset(43) );
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
}
