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

    public static String removeDplicates(String str){
        StringBuilder result = new StringBuilder("");
        HashSet<Character> seen = new HashSet<>();

        for (char ch:str.toCharArray()){
            if(!seen.contains(ch)){
                seen.add(ch);
                result.append(ch);
            }
        }
        return result.toString();
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
            char curr = str.charAt(i);
            // System.out.println(Character.isLowerCase(curr));
            if(Character.isUpperCase(curr)){
                sf.append(Character.toLowerCase(curr));
            }else{
                sf.append(Character.toUpperCase(curr));
            }
        }
        return sf.toString();
    }

    public static Boolean anagram(String s1, String s2){
        Map<Character,Integer> hm1 = new HashMap<>();
        Map<Character,Integer> hm2 = new HashMap<>();

        for(char ch:s1.toCharArray()){
            hm1.put(ch,hm1.getOrDefault(ch,0)+1);
        }
        for(char ch:s2.toCharArray()){
            hm2.put(ch,hm2.getOrDefault(ch,0)+1);
        }
        
        return hm1.equals(hm2);
    }

    public static void capitalizeFirst(String str){
        char cap = Character.toUpperCase(str.charAt(0));
        System.out.println(str.replace(str.charAt(0),cap));
    }

    public static  int countWordOcc(String sent, String f){
        HashMap<String,Integer> hm = new HashMap<>();

        for(String s:sent.split(" "))  {
            hm.put(s,hm.getOrDefault(s,0)+1);
        }

        return hm.getOrDefault(f,-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Task 1
        // String palStr = sc.next();
        // System.out.println(isPalindrome(palStr));

        // task 2
        // Count_vowels_cononents("Java Programming");

        // task 3
        // System.out.println(removeDplicates("programming"));

        // task 4
        // System.out.println(reverse("Hello"));

        // task 5
        // System.out.println(anagram("listen","sielent"));

        // task 6
        // capitalizeFirst("java is fun"); 

        // task 7
        System.out.println(countWordOcc("Java is simple. Java is powerful","simple."));

        // task 8
        // System.out.println(toggle("hello"));

    }
}
