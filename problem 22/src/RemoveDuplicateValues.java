import java.util.Scanner;

public class RemoveDuplicateValues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size : ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Array without duplicates :");
        for (int i = 0; i < size; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                System.out.println("Unique numbers : " + arr[i]);
            }
        }
    }
}
