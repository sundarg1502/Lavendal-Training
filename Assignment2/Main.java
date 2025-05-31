package Assignment2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // // 1. Check Whether a Character is a Vowel or Consonant
        // char c = sc.next().charAt(0);
        
        // if(c == 'a' || c=='e' || c=='i' || c=='o' || c=='u'){
        //     System.out.println(c + " is a Vovwel");
        // }
        // else{
        //     System.out.println(c + " is a Consonant");
        // }

        // 2> Print the Grade Based on Marks
        // int mark = sc.nextInt();

        // if(mark>90 && mark<100){
        //     System.out.println("Grade A");
        // }else if(mark>75 && mark<89){
        //     System.out.println("Grade B");
        // }else if(mark>60 && mark<75){
        //     System.out.println("Grade C");
        // }else if(mark>40 && mark<59){
        //     System.out.println("Grade D");
        // }

        // 3 > Simple Interest or Compound Interest Calculator

        // int p = sc.nextInt();
        // int n = sc.nextInt();
        // float r = sc.nextFloat();
        // int ch = sc.nextInt();
        // if(ch==1){
        //     System.out.println("Simple intrest for "+p+" Rs " + n+"Years and " +" " +r+"% intrest is "+ ((p+n+r)/100));
        // }else{
        //     System.out.println("Compount intrest is"+ p*Math.pow(1+(r/n),(n*r)));
        // }

        // 4 4. Print All Prime Numbers from 1 to N

        int n=100;
        boolean isPrime = true;
        for(int j=2;j<n;j++){
            for(int i=2;i<j;i++){
                if(j%i==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(j);
            }
            isPrime = true;
        }
    }

}
