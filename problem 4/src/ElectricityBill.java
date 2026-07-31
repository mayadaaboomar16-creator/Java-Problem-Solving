import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter units : ");
        int units = input.nextInt();
        double bill = 0;
        if (units <= 100) {
            bill = units * 0.50;
        } else if (units <= 200 ) {
            bill = 100 * 0.50;
            bill = bill + (units - 100) * 0.75;
        } else {
            bill = 100 * 0.50;
            bill = bill + 100 * 0.75;
            bill = bill + (units - 200) * 1.20;
        }
        System.out.println("Bill = " + bill);
    }
}