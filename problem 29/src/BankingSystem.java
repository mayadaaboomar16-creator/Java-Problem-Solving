import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int id = 0;
        String name = "";
        double money = 0;
        int choice;
        do {
            System.out.println("  --- Bank Menu ---");
            System.out.println("1. Create Account");
            System.out.println("2. Add Money");
            System.out.println("3. Take Money");
            System.out.println("4. Show Account");
            System.out.println("5. Exit");
            System.out.print("Choose a number: ");
            choice = input.nextInt();
            if (choice == 1) {
                System.out.print("Enter ID: ");
                id = input.nextInt();
                System.out.print("Enter Name: ");
                name = input.next();
                System.out.print("Enter Money: ");
                money = input.nextDouble();
                System.out.println("Done! Account created.");
            } else if (choice == 2) {
                System.out.print("Enter amount to add: ");
                double amount = input.nextDouble();
                if (amount > 0) {
                    money = money + amount;
                    System.out.println("Done! New money: " + money);
                } else {
                    System.out.println("Wrong amount!");
                }
            } else if (choice == 3) {
                System.out.print("Enter amount to take: ");
                double amount = input.nextDouble();
                if (amount > 0 && amount <= money) {
                    money = money - amount;
                    System.out.println("Done! Remaining money: " + money);
                } else {
                    System.out.println("Not enough money or wrong amount!");
                }
            } else if (choice == 4) {
                System.out.println("  --- Account Details ---");
                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Money: " + money);
            } else if (choice == 5) {
                System.out.println("Goodbye!");
            } else {
                System.out.println("Wrong choice, try again.");
            }

        } while (choice != 5);
    }
}
