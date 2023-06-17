package service;

public class AmountDetails implements InterfaceClass {
   // @Override
    public double withdrawAmount(double amount, double balance) {
        if (amount <= balance) {
            balance -= amount;
            return amount;
        } else {
            System.out.println("Insufficient balance!");
            return 0.0;
        }
    }

    //@Override
    public double depositAmount(double amount, double balance) {
        balance += amount;
        return amount;
    }

    //@Override
    public double accountBalance(double balance) {
        return balance;
    }
}
