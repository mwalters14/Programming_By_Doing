import java.util.Scanner;

public class KeychainSale {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int choice;

    System.out.println("The Keychain Shope");

    System.out.println("1. Add Keychains to Order");
    System.out.println("2. Remove Keychains from Order");
    System.out.println("3. View Current Order");
    System.out.println("4. Checkout");

    System.out.print("\nWhich would you like to do: ");
    choice = keyboard.nextInt();

    while (choice != 4) {
      if (choice == 1) {
        add_keychains();
      } else if (choice == 2) {
        remove_keychains();
      } else if (choice == 3) {
        view_order();
      }
      System.out.println("\n1. Add Keychains to Order");
      System.out.println("2. Remove Keychains from Order");
      System.out.println("3. View Current Order");
      System.out.println("4. Checkout");

      System.out.print("\nWhich would you like to do: ");
      choice = keyboard.nextInt();
    }
    checkout();
  }

  public static void add_keychains() {
    System.out.println("\nADD KEYCHAINS");
  }

  public static void remove_keychains() {
    System.out.println("\nREMOVE KEYCHAINS");
  }

  public static void view_order() {
    System.out.println("\nVIEW ORDER");
  }

  public static void checkout() {
    System.out.println("\nCHECKOUT");
  }
}
