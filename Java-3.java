
import java.util.Scanner;

class Assignment3 {
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

        input = input.toUpperCase();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if ('A' <= ch && ch <= 'Z') {

                alphabetPresent[ch - 'A'] = true;
            }
        }

        for (boolean present : alphabetPresent) {
            if (!present) {
                return false;
            }
        }

        return true;
    }
}
