package BasicSyntax;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Task12SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNum = Double.parseDouble(scanner.nextLine());
        double secondNum = Double.parseDouble(scanner.nextLine());
        String operation = scanner.nextLine();

        double output = 0;

        if (operation.equals("add")) {
            output = firstNum + secondNum;
        } else if (operation.equals("subtract")) {
            output = firstNum - secondNum;
        } else if (operation.equals("divide")) {
            output = firstNum / secondNum;
        } else if (operation.equals("multiply")) {
            output = firstNum * secondNum;
        }
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.printf(df.format(output));
    }
}
