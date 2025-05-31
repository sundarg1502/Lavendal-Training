package Assignment4;
import java.util.*;


public class Main {
    public static boolean isPalindrome(String str){
        int n=str.length()-1;
        int i=0;
        while(i<n/2){
            if(str.charAt(i)!=str.charAt(n-i)){
                return false;
            }
            i++;
        }
        return true;
        
    }
    public static void Count_vowels_cononents(String str){
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("Vowels",0);
        hm.put("Consonants",0);
        String s = "aeiouAEIOU";
        for(int i=0;i<str.length();i++){
            String curr = String.valueOf(str.charAt(i));
            if(s.contains(curr)){
                hm.put("Vowels",hm.get("Vowels")+1);
            }
            else if (!curr.equals(" ")){
                hm.put("Consonants",hm.get("Consonants")+1);
            }
        }
        System.out.println(hm);
    }

    public static String reverse(String str){
        StringBuffer sf = new StringBuffer("");
        for(int i=str.length()-1;i>=0;i--){
            sf.append(str.charAt(i));
        }
        return sf.toString();
    }

    public static String toggle(String str){
        StringBuffer sf = new StringBuffer("");

        for(int i=0;i<str.length();i++){
            Char curr = str.charAt(i);
            
            if(Character.isUpperCase(curr)){
                sf.append(Character.toUpperCase(curr));
            }else{
                sf.append(Character.toLowerCase(curr));
            }
        }
        return sf.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Task 1
        // String palStr = sc.next();
        // System.out.println(isPalindrome(palStr));

        // task 2
        // Count_vowels_cononents("Java Programming");

        // task 4
        // System.out.println(reverse("Hello"));

        // task 8
        System.out.println(toggle("hello"));
        ArrayList

    }
}
