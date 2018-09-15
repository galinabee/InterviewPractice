package prep;

import java.util.Stack;

public class IsValid {
    
    public IsValid(){
        
    }
    
    public boolean isValid(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> st = new Stack<Character>();
        for (char c: arr){
            if (c == '(') st.push(')');
            else if (c == '{') st.push('}');
            else if (c == '[') st.push(']');
            else{
                if (st.empty() || c != st.pop()) return false;
            }
        }
        return st.empty();
    }
}
