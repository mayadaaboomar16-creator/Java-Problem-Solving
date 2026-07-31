import java.util.Scanner;

public class DigitStatistics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number : ");
        String number = input.nextLine();
        int count = number.length();
        int sum = 0;
        int max = 0;
        int min = 9;
        for (int i = 0; i < number.length(); i++) {
            int digit = number.charAt(i) - '0';
            sum = sum + digit;
            if (digit > max) {
                max = digit;
            }
            if (digit < min) {
                min = digit;
            }
        }
        System.out.println("Count = " + count);
        System.out.println("Sum = " + sum);
        System.out.println("Largest = " + max);
        System.out.println("Smallest = " + min);
    }
}