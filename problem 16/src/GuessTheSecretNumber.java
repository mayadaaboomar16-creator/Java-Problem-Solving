import java.util.Scanner;
import java.util.Random;

public class GuessTheSecretNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int secret = random.nextInt(100) + 1;
        int guess = 0;
        int tries = 0;
        while (guess != secret) {
            guess = input.nextInt();
            tries = tries + 1;
            if (guess > secret) {
                System.out.println("Too High");
            } else if (guess < secret) {
                System.out.println("Too Low");
            } else {
                System.out.println("The guess is correct");
            }
        }
        System.out.println("Attempts: " + tries);
    }
}