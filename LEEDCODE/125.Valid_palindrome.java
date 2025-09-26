class Solution {
    public boolean isPalindrome(String s) {
        String out="";
      
        for(int i=0;i<s.length();i++){
           /* if((Character.isUpperCase(s.charAt(i)))||(Character.isLowerCase(s.charAt(i)))||(Character.isDigit(s.charAt(i)))){
                    out+=Character.toLowerCase(s.charAt(i));
            }*/
                
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {   
                out += Character.toLowerCase(c);
            }
        
        }
        for (int i = 0; i < out.length() / 2; i++) {
            if (out.charAt(i) != out.charAt(out.length() - 1 - i)) {
               
                return false; 
            }
        }
        return true;
    }
}/*125. Valid Palindrome
Solved
Easy
Topics
premium lock icon
Companies
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

 

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
  */