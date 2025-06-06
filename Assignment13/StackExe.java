import java.util.HashMap;
import java.util.Stack;

public class StackExe {
    
    static String removeAdj(String str){
        Stack<Character> st = new Stack<>();
        StringBuilder res=new StringBuilder("") ;
        for(char ch:str.toCharArray()){
            if(st.isEmpty()){
                st.push(ch);
            }
            else if(!st.isEmpty() && st.peek()!=ch){
                st.push(ch);
            }
            else if(!st.isEmpty() && st.peek()==ch){
                st.pop();
            }
        }
        while(!st.isEmpty()){
            res.insert(0,st.pop());
        }

        return res.toString();
    }

    static boolean isValidParantheses(String s){
        Stack<Character> st = new Stack<>();
        HashMap<Character,Character> hm = new HashMap<>();
        hm.put(')','(');
        hm.put('}','{');
        hm.put(']','[');

        for(char ch:s.toCharArray()){
            if(hm.containsKey(ch)){
                if(!st.isEmpty() && st.peek() == hm.get(ch)){
                    st.pop();
                }else{
                    return false;
                }
            }else{
                st.push(ch);
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
    
        // Task 1
        // String str = "";
        // String res = removeAdj(str);
        // System.out.println("Result " +res);

        // task 3
        String given = "(()()()))";

        System.out.println(isValidParantheses(given));
    }
}

