import java.util.Scanner;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int id = 0;
        String name = "";
        double salary = 0;
        int choice;
        do {
            System.out.println("  --- Employee Menu ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Show Employee");
            System.out.println("3. Update Salary");
            System.out.println("4. Exit");
            System.out.print("Choose a number: ");
            choice = input.nextInt();
            if (choice == 1) {
                System.out.print("Enter ID: ");
                id = input.nextInt();
                System.out.print("Enter Name: ");
                name = input.nextLine();
                System.out.print("Enter Salary: ");
                salary = input.nextDouble();
                System.out.println("Done, Employee added.");
            } else if (choice == 2) {
                System.out.println("  --- Employee Details ---");
                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Salary: " + salary);
            } else if (choice == 3) {
                System.out.print("Enter new salary: ");
                double newSalary = input.nextDouble();
                if (newSalary >= 0) {
                    salary = newSalary;
                    System.out.println("Done , Salary updated.");
                } else {
                    System.out.println("Wrong salary");
                }
            } else if (choice == 4) {
                System.out.println("Goodbye");
            } else {
                System.out.println("Wrong choice, try again");
            }
        } while (choice != 4);
    }
}