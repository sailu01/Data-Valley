import java.util.Scanner;

public class LibraryFineCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting the number of days the member is late
        System.out.print("Enter the number of days the member is late to return the book: ");
        int daysLate = scanner.nextInt();

        // Calculating fine based on the number of days late
        double fine = 0;

        if (daysLate <= 7) {
            fine = daysLate * 0.5; // 50 paise per day
        } else if (daysLate <= 14) {
            fine = 7 * 0.5 + (daysLate - 7); // 50 paise for the first 7 days, then 1 rupee per day
        } else if (daysLate <= 21) {
            fine = 7 * 0.5 + 7 * 1 + (daysLate - 14) * 5; // 50 paise for the first 7 days, 1 rupee for the next 7 days, then 5 rupees per day
        } else {
            System.out.println("Your membership has been canceled due to returning the book after 21 days.");
            scanner.close();
            return;
        }

        // Displaying the fine
        System.out.println("Fine for returning the book " + daysLate + " days late: Rs. " + fine);

        scanner.close();
    }
}
