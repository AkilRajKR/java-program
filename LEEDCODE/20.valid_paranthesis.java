import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> sta=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('||c=='['||c=='{'){
                sta.push(c);
            }else{
                if(sta.size()==0) return false;
                char top=sta.peek();
                if((c==')'&&top!='(')||(c==']'&&top!='[')||(c=='}'&&top!='{')) return false;
                 sta.pop();
            }
            
        }
    
         return sta.isEmpty();
    }
}
/*import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> sta = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // if stack is not empty and top + current form a valid pair, pop
            if (!sta.isEmpty()) {
                char top = sta.peek();
                if ((top == ')' && c == '(') ||
                    (top == ']' && c == '[') ||
                    (top == '}' && c == '{')) {
                    sta.pop();
                    continue; // move to next character
                }
            }

            // otherwise push current char
            sta.push(c);
        }

        // if stack empty → valid, otherwise invalid
        return sta.isEmpty();
    }
}
*//*Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"

Output: true

Example 2:

Input: s = "()[]{}"

Output: true

Example 3:

Input: s = "(]"

Output: false

Example 4:

Input: s = "([])"

Output: true

Example 5:

Input: s = "([)]"

Output: false

 

Constraints: */