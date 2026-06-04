import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1;
        int attemptsCount = 0;
        int userGuess = 0;
        while (userGuess != targetNumber) {
            System.out.print("Guess a Number Between 1 and 100: ");
            if (scanner.hasNextInt()) {
                userGuess = scanner.nextInt();
                attemptsCount++;
                if (userGuess < targetNumber) {
                    System.out.println("Too Low! Try Again.");
                    System.out.println(); 
                } else if (userGuess > targetNumber) {
                    System.out.println("Too High! Try Again.");
                    System.out.println();
                } else {
                    System.out.println(); 
                    System.out.println("Congratulations! You guessed the number.");
                    System.out.println("Attempts Taken: " + attemptsCount);
                }
            } else {
                System.out.println("Please enter a valid integer.");
                scanner.next();
                System.out.println();
            }
        }
        scanner.close();
    }
}
