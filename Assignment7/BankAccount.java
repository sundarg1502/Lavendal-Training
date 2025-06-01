package Assignment7;

public class BankAccount {
    private int balance = 0;

    public void deposite(int amount){
        this.balance += amount;
    }

    public int getBalance(){
        return balance;
    }

    public static void main(String args[]){
        BankAccount ba = new BankAccount();

        ba.deposite(1000);
        ba.deposite(1000);
        System.out.println(ba.getBalance());

        System.out.println(ba.balance); // works fine if its other class throws error (private not visible)
    }
}
