import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
    if(s.length()!=t.length()) return false;   
 char[] chars = s.toCharArray();
  char[] cha = t.toCharArray();
  Arrays.sort(chars);
  Arrays.sort(cha);
   for(int i=0;i<s.length();i++){
      if(chars[i]!=cha[i]) return false;
    } 
    return true;
    }
}/*class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] count = new int[26]; // For lowercase letters 'a' to 'z'

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++; // add for s
            count[t.charAt(i) - 'a']--; // subtract for t
        }

        // Check if all counts are zero
        for (int c : count) {
            if (c != 0) return false;
        }

        return true;
    }
}
*//*242. Valid Anagram
Solved
Easy
Topics
premium lock icon
Companies
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

 

Example 1:

Input: s = "anagram", t = "nagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false */