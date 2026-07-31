import java.util.Scanner;

public class ReverseAndCompare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String num = input.nextLine();
        String reverse = "";
        for (int i = num.length() - 1; i >= 0; i--) {
            reverse = reverse + num.charAt(i);
        }
        if (num.equals(reverse)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}