import java.util.Scanner;

public class ArrayAnalyzer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        int sum = 0;
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
            sum = sum + arr[i];
        }
        int largest = arr[0];
        int smallest = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        double average = (double) sum / size;
        System.out.println("Largest : " + largest);
        System.out.println("Smallest : " + smallest);
        System.out.println("Sum : " + sum);
        System.out.println("Average : " + average);
    }
}










