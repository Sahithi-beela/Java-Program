import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(25) + 1; 
        Scanner scanner = new Scanner(System.in);
        int attempts = 3;
        boolean guessedCorrectly = false;

        System.out.println("Guess the random number between 1 and 25. You have " + attempts + " attempts!");

        for (int i = 0; i < attempts; i++) {
            System.out.print("Attempt " + (i + 1) + ": Enter your guess: ");
            int userGuess = scanner.nextInt();

            if (userGuess == randomNumber) {
                guessedCorrectly = true;
                break; 
            } else if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        if (guessedCorrectly) {
            System.out.println("Congratulations! You guessed the number: " + randomNumber);
        } else {
            System.out.println("Sorry! You've used all your attempts. The number was: " + randomNumber);
        }

        scanner.close();
    }
}
