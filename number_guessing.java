import java.util.Scanner;
import java.util.Random;

public class number_guessing {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int guess, attempts = 0, min = 1, max = 100, randomNumber = random.nextInt(min, max + 1);
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.printf("I have selected a number between %d and %d. Try to guess it!\n", min, max);

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.printf("Congratulations! You have guessed the number %d in %d attempts!\n", randomNumber, attempts);
            }       
        } while (guess != randomNumber);

        scanner.close();
    }
}