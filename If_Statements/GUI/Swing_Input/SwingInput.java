import javax.swing.*;

public class SwingInput{
  public static void main(String[] args) {
    String name = JOptionPane.showInputDialog("Whats is your name?");

    String input = JOptionPane.showInputDialog("How old are you?");
    int age = Integer.parseInt(input);

    System.out.print("Hello, " + name + ", ");
    System.out.println( "Next year, you'll be " + (age + 1) + "." );

    System.exit(0);
  }
}
