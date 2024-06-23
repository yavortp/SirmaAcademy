package Methods;

import java.util.Scanner;

public class Task09GreaterValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();

        switch (type) {
            case "int" -> compareIntegers(Integer.parseInt(input1), Integer.parseInt(input2));
            case "char" -> compareChars(input1.charAt(0), input2.charAt(0));
            case "string" -> compareStrings(input1, input2);
        }
    }

    public static void compareIntegers(int num1, int num2) {
        if (num1 > num2) {
            System.out.println(num1);
        } else if (num1 < num2) {
            System.out.println(num2);
        } else {
            System.out.println("equal");
        }
    }
    public static void compareChars(char char1, char char2) {
        if (char1 > char2) {
            System.out.println(char1);
        } else if (char1 < char2) {
            System.out.println(char2);
        } else {
            System.out.println("equal");
        }
    }
    public static void compareStrings(String string1, String string2) {
        int result = string1.compareTo(string2);
        if (result > 0) {
            System.out.println(string1);
        } else if (result < 0) {
            System.out.println(string2);
        } else {
            System.out.println("equal");
        }
    }
}
