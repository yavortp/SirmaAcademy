package BasicSyntax;

import java.util.Scanner;

public class Task04FaceOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String figureType = scanner.nextLine();
        double figureArea;

        if (figureType.equals("square")) {
            double side = Double.parseDouble(scanner.nextLine());
            figureArea = side * side;
            System.out.printf("%.2f", figureArea);
        } else if (figureType.equals("rectangle")) {
            double length = Double.parseDouble(scanner.nextLine());
            double width = Double.parseDouble(scanner.nextLine());
            figureArea = length * width;
            System.out.printf("%.2f", figureArea);
        } else if (figureType.equals("triangle")) {
            double side = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            figureArea = side / 2 * height;
            System.out.printf("%.2f", figureArea);
        } else if (figureType.equals("circle")) {
            double radius = Double.parseDouble(scanner.nextLine());
            figureArea = radius * radius * Math.PI;
            System.out.printf("%.2f", figureArea);
        } else {
            System.out.println("Unknown figure!");
        }

    }
}
