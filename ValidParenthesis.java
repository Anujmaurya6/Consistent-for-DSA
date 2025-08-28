import java.util.*;

public class ValidParenthesis {

    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for(char ch:s.toCharArray()){
       if(ch == '(' || ch == '{' || ch == '['){
        st.push(ch);
       }else {
        if(st.isEmpty()){
        return false;
       }else{
        char top=st.pop();
        if((ch == ')' && top != '(') ||
         (ch == ']' && top != '[') ||
          (ch == '}' && top != '{')) {

        return false;
       }
       }     
        }
    }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        String test="{[()]}";
        System.out.println(isValid(test));
        
    
}
}
