import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] questions = {
            "What is the capital of France?",
            "What is the largest planet in our solar system?",
            "What is the boiling point of water in degrees Celsius?",
            "What is the chemical symbol for gold?",
            "What is the longest river in the world?"
        };

        String[][] options = {
            {"1. Paris", "2. London", "3. Berlin", "4. Madrid"},
            {"1. Earth", "2. Jupiter", "3. Saturn", "4. Mars"},
            {"1. 90", "2. 100", "3. 80", "4. 120"},
            {"1. Au", "2. Ag", "3. Pb", "4. Fe"},
            {"1. Nile", "2. Amazon", "3. Yangtze", "4. Mississippi"}
        };

        int[] answers = {1, 2, 2, 1, 2};
        int score = 0, guess;

        System.out.println("****************************************************");
        System.out.println("Welcome to the Quiz! Answer the following questions:");
        System.out.println("****************************************************");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            if (guess == answers[i]) {
                System.out.println("********");
                System.out.println("Correct!");
                System.out.println("********");
                score++;
            } else {
                System.out.println("************************************");
                System.out.println("Incorrect. The correct answer was: " + answers[i]);
                System.out.println("************************************");
            }
        }
        System.out.println("Quiz Over! Your score is: " + score + " out of " + questions.length);

        scanner.close();
    }
}