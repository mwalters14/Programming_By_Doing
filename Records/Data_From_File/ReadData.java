import java.util.Scanner;
import java.io.*;

class Dog {
  String breed;
  int age;
  double weight;
}

public class ReadData {
  public static void main(String[] args) {
    String filename = "C:\\Java\\Programming_By_Doing\\Records\\Data_From_File\\dog.txt";
    Scanner reader = readFile(filename);


    Dog one = new Dog();
    Dog two = new Dog();


     one.breed = reader.next();
     one.age = reader.nextInt();
     one.weight = reader.nextDouble();


     two.breed = reader.next();
     two.age = reader.nextInt();
     two.weight = reader.nextDouble();
     

     System.out.println("The dogs breeds are " + one.breed + ", " + two.breed);
     System.out.println("The dogs ages are " + one.age + ", " + two.age);
     System.out.println("The dogs weights are " + one.weight + ", " + two.weight);
  }

  public static Scanner readFile(String filename){
      File file = new File(filename);
      Scanner sc = null;
      try {
          sc = new Scanner(file);
      } catch (IOException e) {
          System.out.println("Please enter a valid filename");
      }
      return sc;
  }
}
