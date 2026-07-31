import java.util.Scanner;

public class PasswordStrength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Password : ");
        String password = input.nextLine();
        boolean digit = false;
        for (int i = 0; i <= password.length(); i++) {
            char letter = password.charAt(i);
            if (letter >= '0' && letter <= '9') {
                digit = true;
            }
        }
        if (password.length() >= 8 && digit) {
            System.out.println("Strong Password");
        } else {
            System.out.println("Weak Password");
        }
    }
}