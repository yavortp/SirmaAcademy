package MidEXAM;

import java.util.Scanner;

public class Task02CouncilOfElrondVotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split(", ");

        int yesVotes = 0;
        int noVotes = 0;
        int abstainVotes = 0;
        for (int i = 0; i < input.length; i++) {
            String currentVote = input[i];

            switch (currentVote) {
                case "Yes" -> yesVotes++;
                case "No" -> noVotes++;
                case "Abstain" -> abstainVotes++;
            }
        }

        if (yesVotes == 0 && noVotes == 0) {
            System.out.println("Abstain");
        } else if (yesVotes > noVotes) {
            System.out.println("Yes");
        } else if (noVotes > yesVotes) {
            System.out.println("No");
        } else {
            System.out.println("Tie");
        }
    }
}
