package Classes.Task03BankAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Classes.Task03BankAccount.BankAccount.setInterestRate;

public class MainAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        List<BankAccount> accounts = new ArrayList<>();

        int count = 1;
        while (!command.equals("End")) {
            BankAccount account;
            if (command.equals("Create")) {
                account = new BankAccount(count);
                accounts.add(account);
            } else {
                int availableAccounts = accounts.size();
                String [] currentCommand = command.split(" ");
                String action = currentCommand[0];

                if (Integer.parseInt(currentCommand[1]) > availableAccounts) {
                    System.out.println("Account does not exist");
                } else {

                    switch (action) {
                        case "Deposit":
                            int acc = Integer.parseInt(currentCommand[1]);
                            BankAccount currentAcc = accounts.get(acc - 1);
                            currentAcc.deposit(Integer.parseInt(currentCommand[2]));
                            accounts.set(acc - 1, currentAcc);
                            System.out.println("Deposited " + Integer.parseInt(currentCommand[2]) + " to ID" + acc);
                            break;
                        case "SetInterest":
                            int balance = Integer.parseInt(currentCommand[2]);
                            setInterestRate(Integer.parseInt(currentCommand[1]));
                            System.out.printf("%02f%n", Double.parseDouble(currentCommand[1]) * balance);
                            break;
                        case "GetInterest":
                            int acc2 = Integer.parseInt(currentCommand[1]);
                            int years = Integer.parseInt(currentCommand[2]);
                            BankAccount currentAcc2 = accounts.get(acc2 - 1);
                            currentAcc2.getInterest(years);
                            System.out.println("some interest calculation???");
                            break;
                    }
                }
            }
            command = scanner.nextLine();
        }
    }
}
