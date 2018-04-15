import java.util.*;
import java.io.*;

class Car {
  String model;
  String make;
  String license;
  long year;
}

public class ReadData {
  static Scanner keyboard = new Scanner(System.in);
  public static void main(String[] args) {
    Scanner sc = null;
    String filename = "";

    Car[] cars = new Car[2];

    System.out.print("What file name should I load this information from: ");
    filename = keyboard.next();

    sc = read_file(filename);

    while (sc == null) {
      System.out.print("What file name should I load this information from: ");
      filename = keyboard.next();

      sc = read_file(filename);
    }

    System.out.println("Reading data from C:\\Java\\Programming_By_Doing\\Records\\Reading_Data\\" + filename);
    System.out.println();
    
    make_cars(cars, sc);
    display_cars(cars);
  }

  public static void display_cars(Car[] cars) {
    for (int i = 0; i < cars.length ; i++) {
      System.out.println("Car " + (i+1));
      System.out.println("\tMake " + cars[i].make);
      System.out.println("\tModel " + cars[i].model);
      System.out.println("\tYear " + cars[i].year);
      System.out.println("\tLicense " + cars[i].license);
      System.out.println();
    }
  }

  public static void make_cars(Car[] cars, Scanner sc) {
    for (int i = 0; i < cars.length ; i++ ) {
      cars[i] = new Car();

      cars[i].make = sc.next();
      cars[i].model = sc.next();
      cars[i].year = sc.nextLong();
      cars[i].license = sc.next();
    }
  }

  public static Scanner read_file(String filename) {
    File file = new File(filename);
    Scanner sc = null;

    try {
      sc = new Scanner(file);
    } catch (IOException e) {
      System.out.println("Could not resolve file path: C:\\Java\\Programming_By_Doing\\Records\\Reading_Data\\" + filename);
      System.out.println();
    }
    return sc;
  }
}
