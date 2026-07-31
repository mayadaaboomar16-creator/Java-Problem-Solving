import java.util.Scanner;

public class CountdownTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number : ");
        int number = input.nextInt();
        for (int i = number; i >= 0; i--) {
            System.out.println(i);
        }
        System.out.println("Blast Off!");
    }
}