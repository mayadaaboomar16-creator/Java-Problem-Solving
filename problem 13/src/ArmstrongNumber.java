import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a 3-digit number : ");
        String num = input.nextLine();
        char c1 = num.charAt(0);
        char c2 = num.charAt(1);
        char c3 = num.charAt(2);
        int d1 = c1 - '0';
        int d2 = c2 - '0';
        int d3 = c3 - '0';
        int sum = (d1 * d1 * d1) + (d2 * d2 * d2) + (d3 * d3 * d3);
        String sumText = sum + "";
        if (num.equals(sumText)) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }
}