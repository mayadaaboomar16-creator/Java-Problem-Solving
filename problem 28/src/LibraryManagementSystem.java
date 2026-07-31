import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] books = new String[50];
        int[] status = new int[50];
        int count = 0;
        while (true) {
            System.out.println("1- Add Book");
            System.out.println("2- Borrow Book");
            System.out.println("3- Return Book");
            System.out.println("4- Display Available Books");
            System.out.println("5- Exit");
            System.out.print("Choose: ");
            int choice = input.nextInt();
            input.nextLine();
            if (choice == 1) {
                System.out.print("Enter book name : ");
                books[count] = input.nextLine();
                status[count] = 1;
                count++;
                System.out.println("Book Added");
            } else if (choice == 2) {
                System.out.print("Enter book name: ");
                String name = input.nextLine();
                for (int i = 0; i < count; i++) {
                    if (books[i].equals(name)) {
                        if (status[i] == 1) {
                            status[i] = 0;
                            System.out.println("Book Borrowed");
                        } else {
                            System.out.println("Book is not available");
                        }

                    }
                }

            } else if (choice == 3) {
                System.out.print("Enter book name: ");
                String name = input.nextLine();
                for (int i = 0; i < count; i++) {
                    if (books[i].equals(name)) {
                        status[i] = 1;
                        System.out.println("Book Returned");
                    }
                }
            } else if (choice == 4) {
                System.out.println("Available Books:");
                for (int i = 0; i < count; i++) {
                    if (status[i] == 1) {
                        System.out.println(books[i]);
                    }
                }
            } else if (choice == 5) {
                break;
            }
        }
    }
}