import java.util.Scanner;

public class ClassroomStatistics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int highestMark = 0;
        int lowestMark = 0;
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 10; i++) {
            int mark = input.nextInt();
            sum = sum + mark;
            if (i == 1) {
                highestMark = mark;
                lowestMark = mark;
            }
            if (mark > highestMark) {
                highestMark = mark;
            } else if (mark < lowestMark) {
                lowestMark = mark;
            }
            if (mark >= 50) {
                count = count + 1;
            }
        }
        double average = (double) sum / 10;
        System.out.println("Highest : " + highestMark);
        System.out.println("Lowest : " + lowestMark);
        System.out.println("Average : " + average);
        System.out.println("Passed : " + count);
    }
}