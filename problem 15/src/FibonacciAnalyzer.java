import java.util.Scanner;
public class FibonacciAnalyzer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = input.nextInt();
        int firstNumber = 0;
        int secondNumber = 1;
        int sum = 0;
        int largestNumber = 0;
        System.out.println("Fibonacci Numbers :");
        for (int i = 1 ; i <= num ; i++) {
            System.out.println(firstNumber);
            sum = sum + firstNumber;
            largestNumber = firstNumber;
            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
        System.out.println(" The Largest Fibonacci Number : " + largestNumber);
        System.out.println(" The Sum of all generated numbers : " + sum ) ;
    }
}