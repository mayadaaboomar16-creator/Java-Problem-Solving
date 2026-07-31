import java.util.Scanner;

public class SearchReport {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size : ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements :");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        System.out.print("Enter target : ");
        int target = input.nextInt();
        int position = 0;
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                count++;
                if (count == 1) {
                    position = i;
                }
            }
        }
        if (count > 0) {
            System.out.println("Found");
            System.out.println("Position = " + position);
            System.out.println("Occurrences = " + count);
        } else {
            System.out.println("Not Found");
        }
    }
}