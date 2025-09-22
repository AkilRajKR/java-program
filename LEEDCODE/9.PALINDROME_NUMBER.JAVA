import java.util.*;
class Solution {
    public boolean isPalindrome(int x) {
      /*  String b=String.valueOf(x);
        int len=b.length();
        String c="";

        for(int i=len-1;i>=0;i--){
                c+=b.charAt(i);
        }
        boolean out=c.equals(b);
        return out;
       String b=String.valueOf(x);
        String sb=new StringBuilder(b).reverse().toString();
        return b.equals(sb);*/
        int rem=0,rev=0;
        int original=x;
         if(x<0)
            return false;
        while(x!=0){
           rem=x%10;
           rev=rev*10+rem;
           x=x/10;
        }
        return (rev==original);

    }
}/*Given an integer x, return true if x is a palindrome, and false otherwise.

 

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
  */