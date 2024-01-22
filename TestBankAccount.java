class TestBankAccount {
    public static void main(String[] args) {

        BankAccount ryanBankAccount = new BankAccount();
        ryanBankAccount.depositMoney(400, "checking");
        ryanBankAccount.depositMoney(300, "savings");
        ryanBankAccount.withdrawMoney(50, "checking");
        ryanBankAccount.withdrawMoney(600, "checking");
        ryanBankAccount.withdrawMoney(50, "savings");

        BankAccount davidBankAccount = new BankAccount();
        davidBankAccount.depositMoney(700, "checking");
        davidBankAccount.depositMoney(1400, "savings");
        davidBankAccount.withdrawMoney(1000, "checking");
        davidBankAccount.withdrawMoney(400, "savings");

        System.out.println(ryanBankAccount.getCheckingBalance());
        System.out.println(ryanBankAccount.getSavingsBalance());

        System.out.println(davidBankAccount.getCheckingBalance());
        System.out.println(davidBankAccount.getSavingsBalance());

        System.out.println(BankAccount.totalHoldings);

    }
}