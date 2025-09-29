import java.util.*;
class Solution {
    public void reverseString(char[] s) {
       /* int len=s.length;
        for(int i=0;i<len/2;i++){
               char temp=s[i];
                     s[i]=s[len-1-i];
                     s[len-1-i]=temp;
        }
        System.out.print(Arrays.toString(s));*/
        
     Stack<Character> stack = new Stack<>();
        for (char c : s) stack.push(c);

        for (int i = 0; i < s.length; i++) {
            s[i] = stack.pop();
        }
        System.out.print(Arrays.toString(s));


    }
}/*344. Reverse String
Solved
Easy
Topics
premium lock icon
Companies
Hint
Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.

 

Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
  */