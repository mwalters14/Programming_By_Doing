import java.util.Scanner;
import java.io.*;

class Person {
  String name;
  int age;
}

public class ReadData {
  public static void main(String[] args) {
    String filename = "";
    Scanner sc = null;


    sc = check_filePath(filename, sc);

    Person one = new Person();
    Person two = new Person();
    Person three = new Person();
    Person four = new Person();
    Person five = new Person();


    one.name = sc.next();
    one.age = sc.nextInt();

    two.name = sc.next();
    two.age = sc.nextInt();

    three.name = sc.next();
    three.age = sc.nextInt();

    four.name = sc.next();
    four.age = sc.nextInt();

    five.name = sc.next();
    five.age = sc.nextInt();

    System.out.println();
    System.out.println(one.name + " is " + one.age);
    System.out.println(two.name + " is " + two.age);
    System.out.println(three.name + " is " + three.age);
    System.out.println(four.name + " is " + four.age);
    System.out.println(five.name + " is " + five.age);
  }


  public static Scanner check_filePath(String filename, Scanner sc) {
    System.out.print("Enter the file you wish to open: ");
    filename = get_userFile();

    System.out.println("Reading data from " + filename + ".....");
    System.out.println();
    sc = readFile(filename);
    while (sc == null) {
      System.out.print("Enter the file you wish to open: ");
      filename = get_userFile();

      System.out.println();
      System.out.println("Reading data from " + filename + ".....");
      sc = readFile(filename);
    }
    return sc;
  }
  public static String get_userFile() {
    Scanner keyboard = new Scanner(System.in);
    String file;

    file = keyboard.next();
    return file;
  }

  public static Scanner readFile(String filename) {
    File file = new File(filename);
    Scanner sc = null;

    try {
      sc = new Scanner(file);
    } catch(IOException e) {
      System.out.println("File path could not be resolved.");
      System.out.println();
    }
    return sc;
  }
}
