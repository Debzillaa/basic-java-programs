import java.util.Scanner;

public class weight_converter {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    double weight;
    double newWeight;
    int choice;

    System.out.println("Welcome to weight conversion interface");
    System.out.println("1: Convert lbs to kgs");
    System.out.println("2: Convert kgs to lbs");

    System.out.print("Choose an option: ");
    choice = scanner.nextInt();

    if (choice == 1) {
      System.out.print("Enter the weight in lbs: ");
      weight = scanner.nextDouble();
      newWeight = weight * 0.453592;
      System.out.printf("The converted weight is: %.1f kgs\n", newWeight);
    } else if (choice == 2) {
      System.out.print("Enter the weight in kgs: ");
      weight = scanner.nextDouble();
      newWeight = weight * 2.20462;
      System.out.printf("The converted weight is: %.1f lbs\n", newWeight);
    } else {
      System.out.println("It wasn't a valid choice.");
    }

    scanner.close();
  }
}
