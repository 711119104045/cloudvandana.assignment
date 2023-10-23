import java.util.*;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine().trim();
        scanner.close();

        int result = romanToInt(romanNumeral);

        if (result == -1) {
            System.out.println("Invalid Roman numeral input.");
        } else {
            System.out.println("The integer value of " + romanNumeral + " is: " + result);
        }
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int curValue = romanMap.getOrDefault(s.charAt(i), -1);

            if (curValue == -1) {
                return -1; // Invalid Roman numeral character
            }

            if (curValue < prevValue) {
                result -= curValue;
            } else {
                result += curValue;
            }

            prevValue = curValue;
        }

        return result;
    }
}

