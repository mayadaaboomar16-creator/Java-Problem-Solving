import java.util.Scanner;

public class StudentRankingSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int num = input.nextInt();
        String[] names = new String[num];
        int[] marks = new int[num];
        int sum = 0;
        int max = 0;
        int min = 100;
        String topStudent = "";
        String lowestStudent = "";
        int passed = 0;
        for (int i = 0; i < num; i++) {
            System.out.print("Enter student name: ");
            names[i] = input.next();
            System.out.print("Enter mark: ");
            marks[i] = input.nextInt();
            sum = sum + marks[i];
            if (marks[i] > max) {
                max = marks[i];
                topStudent = names[i];
            }
            if (marks[i] < min) {
                min = marks[i];
                lowestStudent = names[i];
            }
            if (marks[i] >= 50) {
                passed++;
            }
        }
        double average = sum / (double) num;
        System.out.println("Top Student = " + topStudent);
        System.out.println("Lowest Student = " + lowestStudent);
        System.out.println("Class Average = " + average);
        System.out.println("Number of Passed Student = " + passed);
    }
}