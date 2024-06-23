package Methods;

import java.util.Scanner;

public class Task06CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        printRectangleArea(width, length);
    }

    public static void printRectangleArea(int width, int length) {
        int area = width * length;
        System.out.println(area);
    }
}
