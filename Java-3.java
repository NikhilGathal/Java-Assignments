
import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        if (isPangram(input)) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    static boolean isPangram(String input) {

        boolean[] alphabetPresent = new boolean[26];

        // Convert the input to lowercase for case-insensitive checking
        // input = input.toLowerCase();

        input = input.toUpperCase();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is an alphabet letter
            if ('A' <= ch && ch <= 'Z') {
                // Set the corresponding entry in the array to true
                alphabetPresent[ch - 'A'] = true;
            }
        }

        // Check if all alphabet letters are present
        for (boolean present : alphabetPresent) {
            if (!present) {
                return false;
            }
        }

        return true;
    }
}
