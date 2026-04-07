class ATM{
    private double balance;

    ATM(double initialBalance) {
        balance = initialBalance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid amount");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void showBalance() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        ATM acc = new ATM(1000);

        acc.deposit(500);
        acc.withdraw(300);
        acc.showBalance();
    }
}
