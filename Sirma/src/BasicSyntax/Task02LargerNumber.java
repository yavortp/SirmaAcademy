package BasicSyntax;

import java.util.Scanner;

public class Task02LargerNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        if (firstNum > secondNum) {
            System.out.println(firstNum);
        } else if (secondNum > firstNum) {
            System.out.println(secondNum);
        } else {
            System.out.println("Numbers are equal!");
        }
    }
}
