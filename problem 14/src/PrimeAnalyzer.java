import java.util.Scanner;
public class PrimeAnalyzer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        int number = input.nextInt();
        int result = 0;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                result = i;
                break;
            }
        }
        if (result == 0) {
            System.out.println(" The number is Prime");
        } else {
            System.out.println("The number is Not Prime");
        }
            System.out.println("Smallest divisor: " + result);


    }
}