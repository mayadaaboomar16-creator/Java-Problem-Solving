import java.util.Scanner;

public class SecondLargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        int largest = arr[0];
        int secondLargest = arr[0];
        for (int i = 0; i < size; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
                secondLargest = largest;
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("Largest Number: " + largest);
        System.out.println("Second Largest Number: " + secondLargest);
    }
}