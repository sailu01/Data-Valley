import java.util.Scanner;

public class VowelChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Converting the input string to lowercase for case-insensitive comparison
        input = input.toLowerCase();

        // Variables to store the count of vowels and flag to indicate presence of vowels
        int vowelCount = 0;
        boolean vowelPresent = false;

        // Checking each character of the input string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            // Checking if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelPresent = true;
                vowelCount++;
            }
        }

        // Displaying the result
        if (vowelPresent) {
            System.out.println("Vowels are present in the string.");
            System.out.println("Total number of vowels: " + vowelCount);
        } else {
            System.out.println("No vowels are present in the string.");
        }

        scanner.close();
    }
}
