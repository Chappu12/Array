class BankAccount{
    private double balance;

    public BankAccount(double initialBalance){
        this.balance = initialBalance;
    }

    public synchronized void deposite(int amount){
        System.out.println("Depositing amount...");
        balance += amount;
        System.out.println("New balance after depositing $"+balance);
    }

    public synchronized void withdraw(int amount){
        if (balance >= amount){
            System.out.println("Withdrawing amount...");
            balance -= amount;
            System.out.println("New balance after withdrawing $"+balance);
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
}

class Transaction implements Runnable{
    private BankAccount account;
    private boolean deposite;
    private int amount;

    public Transaction(BankAccount account, boolean deposite, int amount){
        this.account = account;
        this.deposite = deposite;
        this.amount = amount;
    }

    @Override
    public void run(){
        if (deposite){
            account.deposite(amount);
        }
        else{
            account.withdraw(amount);
        }
    }
}

public class TestSynchronization{
    public static void main(String ar[]){
        BankAccount account = new BankAccount(1000);

        Thread t1 = new Thread(new Transaction(account, true, 500),"deposite");
        Thread t2 = new Thread(new Transaction(account, false, 2200),"withdraw");
        Thread t3 = new Thread(new Transaction(account, true, 300),"deposite");

        t1.start();
        t2.start();
        t3.start();
    }
}