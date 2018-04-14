import java.util.*;
import java.io.*;

class Car {
  String make;
  String model;
  long year;
  String license;

}

public class StoreData {
  static Scanner keyboard = new Scanner(System.in);
  public static void main(String[] args) {
      Car[] cars = new Car[2];
      String filename = "";

      make_cars(cars);

      while (filename == "") {
        filename = set_fileName();
      }

      write_data(cars, filename);
}

  public static String set_fileName() {
    System.out.print("What file name should I store this data under: ");
    String filename = keyboard.next();
    return filename;
  }

  public static void make_cars(Car[] cars) {
    for (int i = 0; i < cars.length ; i++) {
      cars[i] = new Car();

      System.out.println("Car " + (i+1));
      System.out.print("\tMake: ");
      cars[i].make = keyboard.next();

      System.out.print("\tModel: ");
      cars[i].model = keyboard.next();

      System.out.print("\tYear: ");
      cars[i].year = keyboard.nextLong();

      System.out.print("\tLicense: ");
      cars[i].license = keyboard.next();
    }
    System.out.println("");
  }

  public static void write_data(Car[] cars, String filename){
    try {
      PrintWriter writer = new PrintWriter(new FileWriter("C:\\Java\\Programming_By_Doing\\Records\\Storing_Data_In_File\\" + filename));

      for (int i = 0; i < cars.length ; i++ ) {
        writer.print(cars[i].make + " ");
        writer.print(cars[i].model + " ");
        writer.print(cars[i].year + " ");
        writer.print(cars[i].license);
        writer.println("");
      }
      writer.close();
    } catch (IOException e) {
      System.out.println("Could not write file to location.");
    }
    }
}
