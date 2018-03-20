import java.util.Scanner;


public class KeychainStore {
  public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);

      int choice;
      int keychains = 0;
      int current_keychains = 0;
      int price = 10;
      double tax = 0.0825;
      int shipping_cost = 5;
      int shipping_cost_per = 1;

      System.out.println("Keychain Shoppe");

      System.out.println("\n1.Add Keychains to Order");
      System.out.println("2.Remove Keychains from Order");
      System.out.println("3.View Order");
      System.out.println("4.Checkout");

      System.out.println("\nWhich option would you like to choose: ");
      choice = keyboard.nextInt();

      while (choice != 4) {
        if (choice == 1) {
          current_keychains = add_keychains(current_keychains);
        } else if (choice == 2) {
          current_keychains = remove_keychains(current_keychains);
        } else if (choice == 3) {
          view_order(current_keychains, price, tax, shipping_cost_per, shipping_cost);
        }
        System.out.println("\n1.Add Keychains to Order");
        System.out.println("2.Remove Keychains from Order");
        System.out.println("3.View Order");
        System.out.println("4.Checkout");
        System.out.println("\n Which option would you like to choose: ");
        choice = keyboard.nextInt();
      }
      checkout(current_keychains, price, tax, shipping_cost_per, shipping_cost);
  }

  public static int add_keychains(int current_keychains) {
    Scanner keyboard = new Scanner(System.in);
    int keychains = 0;

    System.out.println("\nYou have " + current_keychains + " keychains");
    System.out.println("How many to add: ");
    keychains = keyboard.nextInt();

    while (keychains < 0) {
      System.out.println("Keychains to add must be over 0");
      System.out.print("How many to add: ");
      keychains = keyboard.nextInt();
    }

    current_keychains += keychains;
    System.out.println("\nYou now have " + current_keychains + " keychains");

    return current_keychains;
  }

  public static int remove_keychains(int current_keychains) {
    Scanner keyboard = new Scanner(System.in);
    int keychains = 0;

    System.out.println("\nYou have " + current_keychains + " keychains");
    System.out.println("How many to remove: ");
    keychains = keyboard.nextInt();

    while (keychains > current_keychains) {
      System.out.println("You can't remove more keychains than you have");
      System.out.println("\nYou have " + current_keychains + " keychains");
      System.out.print("How many to remove: ");
      keychains = keyboard.nextInt();
    }

    while (keychains < 0) {
      System.out.println("Keychains to remove must be greater than -1");
      System.out.print("How many to remove: ");
      keychains = keyboard.nextInt();
    }

    current_keychains -= keychains;

    System.out.println("\nYou now have " + current_keychains + " keychains");
    return current_keychains;
  }

  public static void view_order(int current_keychains, int price, double tax, int shipping_cost_per, int shipping_cost) {
    int total_no_tax = 0;
    double total_with_tax = 0.0;
    double calculate_tax = 0.0;

    total_no_tax = (current_keychains * price) + (current_keychains + shipping_cost_per) + shipping_cost;
    calculate_tax = total_no_tax * tax;
    total_with_tax = calculate_tax + total_no_tax;

    System.out.println("\nYou have " + current_keychains + " keychains");
    System.out.println("The shipping cost for each key is " + shipping_cost_per + "$");
    System.out.println("The shipping cost is " + shipping_cost + "$");
    System.out.println("The sales tax is " + tax + "%");
    System.out.println("Keychains cost 10$ each");
    System.out.println("Your total before tax is " + total_no_tax + "$");
    System.out.println("Your total with tax " + total_with_tax + "$");
  }

  public static void checkout(int current_keychains, int price, double tax, int shipping_cost_per, int shipping_cost) {
    Scanner keyboard = new Scanner(System.in);

    String name;

    System.out.print("\nEnter your name: ");
    name = keyboard.nextLine();

    view_order(current_keychains, price, tax, shipping_cost_per, shipping_cost);
    System.out.println("Thanks for your order, " + name + "!");
  }
}
