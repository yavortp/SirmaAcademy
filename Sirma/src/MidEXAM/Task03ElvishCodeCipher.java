package MidEXAM;

import java.util.Scanner;

public class Task03ElvishCodeCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int shiftIndex = Integer.parseInt(scanner.nextLine());

        System.out.println(decipherText(input, shiftIndex));

    }

    public static String decipherText (String input, int index) {

        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {

            char currentChar = input.charAt(i);
            output.append(Character.toString(currentChar - index));

        }

        return output.toString();
    }
}
