import java.util.Scanner;
import java.util.Random;

public class rock_paper_scissors {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"Rock", "Paper", "Scissors"};
        String playerChoice, computerChoice, playAgain = "yes";

        do {
            System.out.print("Enter your move (Rock, Paper, Scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();
            if (!playerChoice.equals("rock") && 
            !playerChoice.equals("paper") && 
            !playerChoice.equals("scissors")) {
            System.out.println("Invalid choice. Please enter Rock, Paper, or Scissors.");
            continue;
            }

            int computerIndex = random.nextInt(choices.length);
            computerChoice = choices[computerIndex].toLowerCase();
            System.out.println("Computer chose: " + choices[computerIndex]);

            if (playerChoice.equals(computerChoice)) {
            System.out.println("It's a tie!");
            } else if (playerChoice.equals("rock") && computerChoice.equals("scissors") ||
                   playerChoice.equals("paper") && computerChoice.equals("rock") ||
                   playerChoice.equals("scissors") && computerChoice.equals("paper")) {
            System.out.println("Player wins!");
            } else {
            System.out.println("Computer wins!");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();
        } while (playAgain.equals("yes"));

        System.out.println("Thanks for playing!");

        scanner.close();
    }
}
