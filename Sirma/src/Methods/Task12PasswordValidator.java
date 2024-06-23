package Methods;

import java.util.Scanner;

public class Task12PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        validatePassword(password);
    }

    public static void validatePassword(String pass) {
        boolean isLongEnough = false;
        boolean hasRestrictedSymbols = false;
        boolean hasAtLeastTwoDigits = false;

        if (pass.length() >= 6 && pass.length() <= 10) {
            isLongEnough = true;
        }

        int numbersCount = 0;
        for (int i = 0; i < pass.length(); i++) {
            if (pass.charAt(i) >= 48 && pass.charAt(i) <= 57) {
                numbersCount++;
            }
            if (pass.charAt(i) < 48 || pass.charAt(i) > 57 && pass.charAt(i) < 65 || pass.charAt(i) > 90 && pass.charAt(i) < 97 || pass.charAt(i) > 122) {
                hasRestrictedSymbols = true;
            }
        }

        if (numbersCount >= 2) {
            hasAtLeastTwoDigits = true;
        }

        if (!isLongEnough) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (hasRestrictedSymbols) {
            System.out.println("Password must contain only letters and digits");
        }
        if (!hasAtLeastTwoDigits) {
            System.out.println("Password must have at least 2 digits");
        }

        if (isLongEnough && !hasRestrictedSymbols && hasAtLeastTwoDigits) {
            System.out.println("Password is valid");
        }

    }
}
