import java.util.Scanner;

public class StringAnalyzer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Text : ");
        String text = input.nextLine();
        int totalChars = text.length();
        int totalWords = text.trim().length();
        int count = 0;
        int otherCount = 0;
        String lowerText = text.toLowerCase();
        for (int i = 0; i < lowerText.length(); i++) {
            char letter = lowerText.charAt(i);
            if (Character.isLetter(letter)) {
                if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                    count++;
                } else {
                    otherCount++;
                }
            }
        }
        System.out.println("Number of Characters: " + totalChars);
        System.out.println("Number of Words: " + totalWords);
        System.out.println("Number of Vowels: " + count);
        System.out.println("Number of Consonants: " + otherCount);
    }
}