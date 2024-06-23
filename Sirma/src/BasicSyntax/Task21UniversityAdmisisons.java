package BasicSyntax;

import java.util.Scanner;

public class Task21UniversityAdmisisons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = Integer.parseInt(scanner.nextLine());
        int extracurriculars = Integer.parseInt(scanner.nextLine());

        boolean isAdmitted = false;

        if (score >= 90) {
            isAdmitted = true;
        } else if (score >= 80 && score <= 89) {
            if (extracurriculars >= 2) {
                isAdmitted = true;
            }
        } else if (score < 80) {
            isAdmitted = false;
        }

        if (isAdmitted) {
            System.out.println("Admitted");
        } else {
            System.out.println("Not admitted");
        }
    }
}
