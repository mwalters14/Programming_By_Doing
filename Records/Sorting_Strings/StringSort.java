import java.util.Scanner;
import java.io.*;

class Car {
  String make;
  String model;
  String license;
  long year;
}

public class StringSort {

  public static void main(String[] args) {
    Scanner sc;
    sc = read_file();

    Car[] cars = new Car[5];

    load_data(cars,sc);
    bubble_sort(cars);
    display_array(cars);
  }

  public static void display_array(Car[] cars) {
    for (int i = 0; i < cars.length ; i++ ) {
      System.out.println("Car " + (i+1));
      System.out.println("\tMake: " + cars[i].make);
      System.out.println("\tModel: " + cars[i].model);
      System.out.println("\tYear: " + cars[i].year);
      System.out.println("\tLicense: " + cars[i].license);
    }
  }

  public static void bubble_sort( Car[] cars )
	{
		boolean swapped = true;
    int j = 0;
    while (swapped) {
      swapped = false;
      j++;

      for (int i = 0; i < cars.length - j ; i++) {
        if (cars[i].make.compareTo(cars[i+1].make) > 0) {
          swap(cars,i);
          swapped = true;
        }
      }
    }
	}

  public static void swap( Car[] cars , int i )
  {
    String make = cars[i].make;
    String model = cars[i].model;
    long year = cars[i].year;
    String license = cars[i].license;

    cars[i].make = cars[i + 1].make;
    cars[i].model = cars[i + 1].model;
    cars[i].year = cars[i + 1].year;
    cars[i].license = cars[i + 1].license;

    cars[i + 1].make = make;
    cars[i + 1].model = model;
    cars[i + 1].year = year;
    cars[i + 1].license = license;
  }

  public static void load_data(Car[] cars, Scanner sc){
    for (int i = 0; i < cars.length ; i++) {
      cars[i] = new Car();
      cars[i].make = sc.next();
      cars[i].model = sc.next();
      cars[i].year = sc.nextLong();
      cars[i].license = sc.next();
    }
  }

  public static Scanner read_file() {
    String filename;
    Scanner sc;
    Scanner keyboard = new Scanner(System.in);

    filename = "";
    sc = null;

    while(!valid_file(sc)) {
      try {
        System.out.print("Enter file name: ");
        filename = keyboard.next();

        File file = new File(filename);
        sc = new Scanner(file);
      } catch(IOException e) {
        System.out.println("Invalid file path.");
        System.out.println();
      }
    }
    return sc;
  }

  public static boolean valid_file(Scanner sc) {
    boolean valid = false;
    if (sc != null) {
      valid = true;
    }
    return valid;
  }
}
