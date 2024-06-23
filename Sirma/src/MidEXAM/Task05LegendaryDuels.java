package MidEXAM;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task05LegendaryDuels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        boolean isLegendary = false;

        String result = input;
        String previous;

        while (result.length() > 0) {

            previous = result;
            result = result.replaceAll("!!|\\{\\}|\\(\\)", "");

            if (result.length() == 0) {
                isLegendary = true;
            }

            if (previous.equals(result)) {
                break;
            }
        }

        if (isLegendary){
            System.out.println("Legendary");
        } else {
            System.out.println("Not Legendary");
        }

    }
}
