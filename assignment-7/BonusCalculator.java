import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting current year
        System.out.print("Enter the current year: ");
        int currentYear = scanner.nextInt();

        // Getting year of joining
        System.out.print("Enter the year of joining: ");
        int yearOfJoining = scanner.nextInt();

        // Calculating years of service
        int yearsOfService = currentYear - yearOfJoining;

        // Checking eligibility for bonus
        if (yearsOfService > 5) {
            System.out.println("Congratulations! You are eligible for a bonus of Rs. 5000/-");
        } else if (yearsOfService >= 3) {
            System.out.println("Congratulations! You are eligible for a bonus of Rs. 3000/-");
        } else {
            System.out.println("Sorry, you are not eligible for any bonus at this time.");
        }

        scanner.close();
    }
}
