public class BankAccount {

    private double checkingBalance;
    private double savingsBalance;

    private static int numberOfAccounts = 0;
    private static double totalHoldings = 0;

    public BankAccount() {
        numberOfAccounts++;
        this.checkingBalance = 0;
        this.savingsBalance = 0;
    }

    public void depositMoney(double amount, String account) {
        if (account == "checking") {
            this.checkingBalance += amount;
        } else {
            this.savingsBalance += amount;
        }
        this.totalHoldings += amount;
    }

    public void withdrawMoney(double amount, String account) {
        if (account == "checking") {
            this.checkingBalance -= amount;
        } else {
            this.savingsBalance -= amount;
        }
        this.totalHoldings -= amount;
    }

    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public double getSavingsBalance() {
        return this.savingsBalance;
    }
}
