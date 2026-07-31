import java.util.Scanner;

public class SumChallenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Num (N) : ");
        int num = input.nextInt();
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                evenSum = evenSum + i;
            } else {
                oddSum = oddSum + i;
            }
        }
        System.out.println("Even Sum = " + evenSum);
        System.out.println("Odd Sum = " + oddSum);
    }
}