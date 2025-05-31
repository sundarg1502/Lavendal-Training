import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // // Type Conversion Challenge - 1
        // int i;
        // char c;
        // float f;

        Scanner sc = new Scanner(System.in);

        // i = sc.nextInt();
        // c = sc.next().charAt(0);
        // f = sc.nextFloat();
        // // Convert the integer to a float and add it to the float input.
        // System.out.println((float)i+f);

        // // Convert the character to its ASCII value and add it to the integer.
        // System.out.println(c+i);

        // Task 2 2. Arithmetic Expression Evaluator
        
        // int a,b;
        // double c;
        // a = sc.nextInt();
        // b = sc.nextInt();
        // c = sc.nextDouble();

        // System.out.println(a+" + "+b+" is "+(a+b));
        // System.out.println(a+" - "+b+" is "+(a-b));
        // System.out.println(a+" * "+b+" is "+(a*b));
        // System.out.println(a+" / "+b+" is "+(a/b));
        // System.out.println(a+" + and * "+b+" is "+(a+b)*c);

        // Task 3 3. Bitwise Operator Experiment

        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();


        System.out.println(a+" and * "+b+" is "+( a^b));

        System.out.println(a+" << of 2 is "+(a<<2));
        System.out.println(a+" >> of 2 is "+(a>>2));
    
        System.out.println(b +" << of 2 is "+(b <<2));
        System.out.println(b +" >> of 2 is "+(b >>2));
    }
}
