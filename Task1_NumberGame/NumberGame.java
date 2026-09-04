package CODSOFT;
import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int score = 0;
        char playAgain;

        System.out.println("=================================");
        System.out.println("       🎯 NUMBER GUESSING GAME");
        System.out.println("=================================");

        do {
            int number = random.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 7;
            boolean guessed = false;

            System.out.println("\nI have selected a number between 1 and 100.");
            System.out.println("You have " + maxAttempts + " attempts.");

            while (attempts < maxAttempts) {

                System.out.print("\nEnter your guess: ");
                int guess = sc.nextInt();

                // Validate input
                if (guess < 1 || guess > 100) {
                    System.out.println("⚠️ Please enter a number between 1 and 100.");
                    continue;
                }

                attempts++;

                if (guess == number) {
                    System.out.println("🎉 Correct! You guessed the number.");
                    System.out.println("Attempts used: " + attempts);

                    score += (maxAttempts - attempts + 1) * 10;
                    guessed = true;
                    break;

                } else if (guess < number) {
                    System.out.println("📈 Too low! Try a higher number.");

                } else {
                    System.out.println("📉 Too high! Try a lower number.");
                }
            }

            if (!guessed) {
                System.out.println("\n❌ You ran out of attempts.");
                System.out.println("The correct number was: " + number);
            }

            System.out.println("Current Score: " + score);

            System.out.print("\nDo you want to play another round? (Y/N): ");
            playAgain = sc.next().charAt(0);

        } while (playAgain == 'Y' || playAgain == 'y');

        System.out.println("\n=================================");
        System.out.println("       GAME OVER");
        System.out.println("Final Score: " + score);
        System.out.println("Thanks for playing! 🎮");
        System.out.println("=================================");

        sc.close();
    }
}


