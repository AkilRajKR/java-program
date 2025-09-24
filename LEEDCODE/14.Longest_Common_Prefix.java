import java.util.*;
class Solution {
    public String longestCommonPrefix(String[] strs) {
     
        StringBuilder result=new StringBuilder();
        Arrays.sort(strs);

       String first = strs[0];
        String last = strs[strs.length - 1];

        for (int i = 0; i < first.length(); i++) {
            if (i < last.length() && first.charAt(i) == last.charAt(i)) {
                result.append(first.charAt(i));
            } else {
                break;
            }
        }
       return result.toString();
    }
}/*14. Longest Common Prefix
Solved
Easy
Topics
premium lock icon
Companies
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings. */