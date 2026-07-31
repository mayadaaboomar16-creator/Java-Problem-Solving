import java.util.Scanner;

public class PalindromeNumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        String number = input.nextLine();
        String reverse = "";
        for (int i = number.length() - 1; i >= 0; i--) {
            reverse = reverse + number.charAt(i);
        }
        if (number.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
            System.out.println("Reversed Number = " + reverse);
        }
    }
}