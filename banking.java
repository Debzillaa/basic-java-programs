import java.util.Scanner;

public class banking {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double balance = 0.00;
        boolean isRunning = true;
        int choice;

        while (isRunning) {
            System.out.println("***********************************");
            System.out.println("Welcome to the Banking Application!");
            System.out.println("***********************************");
            System.out.println("\n1. Show Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit\n");

            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += depositMoney();
                case 3 -> balance -= withdrawMoney(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }

        System.out.println("Thank you for using the Banking Application. Goodbye!");

        scanner.close();
    }

    static void showBalance(double balance) {
        System.out.printf("Your current balance is: Rs%.2f%n", balance);
    }

    static double depositMoney() {
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        if (amount < 0) {
            System.out.println("Deposit amount must be positive.");
            return 0;
        } else {
            System.out.printf("You have successfully deposited Rs%.2f%n", amount);
            return amount;
        }
    }

    static double withdrawMoney(double balance) {
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (amount < 0) {
            System.out.println("Withdrawal amount must be positive.");
            return 0;
        } else if (amount > balance) {
            System.out.println("Insufficient balance for this withdrawal.");
            return 0;
        } else {
            System.out.printf("You have successfully withdrawn Rs%.2f%n", amount);
            return amount;
        }
    }
}