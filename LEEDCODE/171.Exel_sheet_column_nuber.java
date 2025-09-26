class Solution {
    public int titleToNumber(String columnTitle) {
        int sum=0;
        for(int i=0;i<columnTitle.length();i++){
               int digit = columnTitle.charAt(i) - 'A' + 1; 
            sum = sum * 26 + digit;   
        }
        return sum;
    }
}/*171. Excel Sheet Column Number
Solved
Easy
Topics
premium lock icon
Companies
Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.

For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...
 

Example 1:

Input: columnTitle = "A"
Output: 1
Example 2:

Input: columnTitle = "AB"
Output: 28
Example 3:

Input: columnTitle = "ZY"
Output: 701
  */