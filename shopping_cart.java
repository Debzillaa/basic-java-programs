import java.util.Scanner;

public class shopping_cart {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    String item;
    double price;
    int quantity;
    String currency = "Rs";
    double total;

    System.out.print("What item would you like to purchase?: ");
    item = scanner.nextLine();

    System.out.print("What is the price for each?: ");
    price = scanner.nextDouble();

    System.out.print("How many would you like?: ");
    quantity = scanner.nextInt();

    total = price * quantity;

    System.out.println("You have bought " + quantity + " " + item + "(s)");
    System.out.println("Your total is " + currency + total);

    scanner.close();
  }
}
