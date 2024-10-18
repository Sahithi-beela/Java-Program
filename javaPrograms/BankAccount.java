
class BankAccount {
    private double balance;

   
    public BankAccount(double balance) {
        this.balance = balance;
    }

   
    public double getBalance() {
        return balance;
    }

   
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
           
            throw new InsufficientBalanceException(balance, amount);
        }
        balance -= amount; // Deduct amount if sufficient balance
        System.out.println("Withdrawal successful! New balance: $" + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        
        BankAccount account = new BankAccount(500);

        
        try {
            account.withdraw(600); 
        } catch (InsufficientBalanceException e) {
            
            System.out.println(e.getMessage());
        }
    }
}