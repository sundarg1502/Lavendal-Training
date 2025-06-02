package Assignment5;

public class Recursion {
    public static int count(int n){
        if(n<10){
            return 1;
        }
        return 1+count(n/10);
    }
    public static boolean isPalindrome(String str,int start,int end){
        if(start>=end){
            return true;
        }
        if(str.charAt(start)!=str.charAt(end)){
            return false;
        }

        return isPalindrome(str,start+1,end-1);
    }
    public static int pow(int n,int p){
        if(p<1){
            return 1;
        }
        return n*pow(n,p-1);
    }
    public static void main(String[] args){
        // task 1
        System.out.println(count(23344));

        // task 2
        // String s = "madddam";
        // System.out.println(isPalindrome(s,0,s.length()-1));
        // task 3
        // System.out.println(pow(3,3));
    }
}
