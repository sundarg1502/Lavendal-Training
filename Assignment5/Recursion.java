package Assignment5;

public class Recursion {
    public static int count(int n){
        int counter=0;
        counter++;
        if(n<0){
            return 0;
        }
        int rn=n/2;
        count(rn);
        return counter;
    }
    public static int pow(int n,int p){
        if(p<1){
            return 1;
        }
        return n*pow(n,p-1);
    }
    public static void main(String[] args){
        // task 1
        System.out.println(count(234));
        // task 3
        // System.out.println(pow(3,3));
    }
}
