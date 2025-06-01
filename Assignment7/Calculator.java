package Assignment7;

public class Calculator {
    public int result=0;
    public static int opcount = 0;

    public int add(int a, int b){
        opcount++;
        result = a+b;
        return result;
    }

    public static int opCount(){
        return opcount;
    }
    public static void main(String[] args){
        Calculator c1 = new Calculator();
        Calculator c2 = new Calculator();
        Calculator c3 = new Calculator();

        // BankAccount ba = new BankAccount();
        // int bal = ba.balance;
        c1.add(10,20);
        c2.add(3,4);
        c2.add(23,45);

        System.out.println(Calculator.opCount());
    }
}
