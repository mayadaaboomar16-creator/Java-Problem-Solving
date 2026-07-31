import java.util.Scanner;

public class CharacterFrequencyReport {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String text = input.nextLine();
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            if (text.indexOf(letter) == i) {
                int count = 0;
                for (int j = 0; j < text.length(); j++) {
                    if (text.charAt(j) == letter) {
                        count++;
                    }
                }
                System.out.println(letter + " : " + count);
            }
        }
    }
}