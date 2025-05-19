class LessBalanceException extends Exception{
    public LessBalanceException(double amount){
        super("Withdraw amount (" + amount + " Rs) is not valid.");
    }
}
class Account{
    double balance;
    static final double min_balance=500;

    public Account(){
        balance=min_balance;
    }

    public void deposit(double amount){
        balance+=amount;
        System.out.println("Deposited " + amount + " Rs. New balance: " + balance + " Rs");
    }

    public void withdraw(double amount) throws LessBalanceException{
        if (balance-amount < min_balance){
            throw new LessBalanceException(amount);
        }
        balance -= amount;
        System.out.println("Withdrawn " + amount + " Rs. New balance: " + balance + " Rs");
    }
    public double getBalance() {
        return balance;
    }
}

public class TestAccount{
    public static void main(String[] args){
        Account acc1=new Account();
        Account acc2=new Account();

        acc1.deposit(1000);
        acc2.deposit(800);

        try{
            acc1.withdraw(1700);
        } catch (LessBalanceException e){
            System.out.println("LessBalanceException: "+e.getMessage());
        }

        try{
            acc2.withdraw(200);
        }catch (LessBalanceException e){
            System.out.println("LessBalanceException: "+e.getMessage());
        }


    }
}


