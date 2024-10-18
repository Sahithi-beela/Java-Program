
interface AccountOperation {
    void deposit(double amount);
    double getBalance();
}


class Account implements AccountOperation {
    private double balance;

    public Account() {
        this.balance = 0.0; 
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}


public class Main {
    public static void main(String[] args) {
        Account myAccount = new Account();

        myAccount.deposit(150.0);
        System.out.println("Current Balance: $" + myAccount.getBalance());

        myAccount.deposit(50.0);
        System.out.println("Current Balance: $" + myAccount.getBalance());

        myAccount.deposit(-20.0); 
        System.out.println("Current Balance: $" + myAccount.getBalance());
    }
}
