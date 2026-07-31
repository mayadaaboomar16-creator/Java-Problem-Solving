import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your weight (kg) : ");
        double weight = input.nextDouble();
        System.out.print("Enter your height (m) : ");
        double height = input.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("BMI = " + bmi);
        if (bmi <= 50) {
            System.out.println("Underweight");
        } else if (bmi <= 70 && bmi > 50) {
            System.out.println("Normal");
        } else if (bmi <= 100 && bmi > 70) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}