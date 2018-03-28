import java.util.Scanner;

public class CallingFunction {
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



  public static String weekday(int birth_month, int birth_day, int birth_year) {
    int yy, total;
    String date = "";
    boolean leap = false;

    WeekdayCalculator weekday_calc = new WeekdayCalculator();
    WeekdayName weekday_name = new WeekdayName();
    MonthOffset offset = new MonthOffset();
    MonthName month_name = new MonthName();

    leap = weekday_calc.is_leap(birth_year);
    yy = birth_year - 1900;
    total = yy / 4;
    total += yy;
    total += birth_day;
    total += offset.Offset(birth_month);
    if (leap && birth_month == 1 || birth_month == 2) {
      total -= 1;
    }
    total = total % 7;
    date = weekday_name.weekday_name(total) + ", " + month_name.getMonth(birth_month) + " " + birth_day + ", " + birth_year + "!";

    return date;
  }
}
