import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine().toLowerCase(); 
        scanner.close();

        boolean[] alphabet = new boolean[26]; '

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= 'a' && c <= 'z') {
                int index = c - 'a';
                alphabet[index] = true;
            }
        }

        boolean isPangram = true;
        for (boolean letter : alphabet) {
            if (!letter) {
                isPangram = false;
                break;
            }
        }

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}
