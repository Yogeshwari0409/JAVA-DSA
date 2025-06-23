import java.util.Scanner;

public class DuckNumberChecker {

    // Method to check if a number is a Duck Number
    public static boolean isDuckNumber(String number) {
        // A number starting with 0 is not a Duck Number
        if (number.charAt(0) == '0') {
            return false;
        }

        // Check for at least one '0' in the remaining digits
        for (int i = 1; i < number.length(); i++) {
            if (number.charAt(i) == '0') {
                return true;
            }
        }

        return false;
    }

    // Main method to take input and display result
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String number = scanner.nextLine();

        if (isDuckNumber(number)) {
            System.out.println(number + " is a Duck Number.");
        } else {
            System.out.println(number + " is NOT a Duck Number.");
        }

        scanner.close();
    }
}
