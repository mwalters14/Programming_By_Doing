import java.util.Scanner;

public class AreaCalculator {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    int shape_choice = 0;
    int area = 0;
    double double_area = 0.0;

    System.out.println("Shape Area Calculator");

    System.out.println("------------------------------------------------");

    System.out.println("1) Triangle");
    System.out.println("2) Rectangle");
    System.out.println("3) Square");
    System.out.println("4) Circle");
    System.out.println("5) Quit");

    System.out.print("Which shape: ");
    shape_choice = keyboard.nextInt();

    while (shape_choice != 5) {
      if (shape_choice == 1) {
        int base, height;

        System.out.print("Base: ");
        base = keyboard.nextInt();

        System.out.print("Height: ");
        height = keyboard.nextInt();

        area = (int) area_triangle(base, height);

      } else if (shape_choice == 2) {
        int length, width;

        System.out.print("Length: ");
        length = keyboard.nextInt();

        System.out.print("Width: ");
        width = keyboard.nextInt();

        area = area_rectangle(length, width);

      } else if (shape_choice == 3) {
        int side;

        System.out.print("Side: ");
        side = keyboard.nextInt();

        area = area_square(side);

      } else if (shape_choice == 4) {
        int radius;

        System.out.print("Radius: ");
        radius = keyboard.nextInt();

        double_area = area_circle(radius);

      } else {
        System.out.println("I don't understand your shape choice");
        System.out.print("Which shape: ");
        shape_choice = keyboard.nextInt();
      }

      if (shape_choice != 5 && shape_choice == 4) {
          System.out.println("The area is " + double_area);
      } else {
          System.out.println("\nThe area is " + area);
      }

      System.out.print("Which shape: ");
      shape_choice = keyboard.nextInt();
    }
  }

  public static double area_circle(int radius) {
    double area;

    area = Math.PI * (radius * radius);
    return area;
  }
  public static int area_rectangle(int length, int width) {
    int area;

    area = length * width;
    return area;
  }

  public static int area_square(int side) {
    int area;

    area = side * side;
    return area;
  }

  public static double area_triangle(int base, int height) {
    double area;

    area = ((base * height) * 1/2);
    return area;
  }
}
