import java.util.Scanner;

public class AtmSimulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance = 1000.0;
        int choice;
        do {
            System.out.println("  --- ATM Menu ---  ");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = input.nextInt();
            if (choice == 1) {
                System.out.print("Enter amount to deposit : ");
                double amount = input.nextDouble();
                if (amount > 0) {
                    balance = balance + amount;
                    System.out.println("Successfully deposited! New Balance: " + balance);
                } else {
                    System.out.println("Invalid amount ");
                }
            } else if (choice == 2) {
                System.out.print("Enter amount to withdraw : ");
                double amount = input.nextDouble();
                if (amount > 0 && amount <= balance) {
                    balance = balance - amount;
                    System.out.println("Done , New balance is : " + balance);
                } else {
                    System.out.println("Not enough money or wrong amount");
                }
            } else if (choice == 3) {
                System.out.println("Your Balance is : " + balance);
            } else if (choice == 4) {
                System.out.println("Thank you , Goodbye!");
            } else {
                System.out.println("Wrong choice, please try again");
            }

        } while (choice != 4);
    }
}