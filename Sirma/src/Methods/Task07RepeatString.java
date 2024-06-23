package Methods;

import java.util.Scanner;

public class Task07RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int repeats = Integer.parseInt(scanner.nextLine());

        printRepeatedString(input, repeats);
    }

    public static void printRepeatedString(String string, int repeat) {
        String result = "";
        for (int i = 1; i <= repeat; i++) {
            result = result + string;
        }

        System.out.println(result);
    }
}
