import java.util.Scanner;

public class TemperatureMonitor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] temp = new int[7];
        int sum = 0;
        int max = 0;
        int min = 100;
        System.out.println("Enter 7 temperatures:");
        for (int i = 0; i < 7; i++) {
            temp[i] = input.nextInt();
            sum = sum + temp[i];
            if (temp[i] > max) {
                max = temp[i];
            }
            if (temp[i] < min) {
                min = temp[i];
            }
        }
        double average = sum / 7.0;
        int count = 0;
        for (int i = 0; i < 7; i++) {
            if (temp[i] > average) {
                count++;
            }
        }
        System.out.println("Highest Temperature = " + max);
        System.out.println("Lowest Temperature = " + min);
        System.out.println("Weekly Average = " + average);
        System.out.println("Days Above Average = " + count);
    }
}