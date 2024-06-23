package Classes.Task03BankAccount;

class BankAccount {
    private int id;
    private double balance;
    private static double interestRate = 0.02;

    public BankAccount(int id) {
        this.id = id;
        this.balance = 0.0;
    }

    public static void setInterestRate(double interest) {
        interestRate = interest;
    }

    public void deposit (double amount) {
        this.balance += amount;
    }

    public double getInterest(int years) {
        return this.balance * interestRate * years;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }
}


