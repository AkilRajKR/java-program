 import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
     /*   int mul=(num1-'0')*(num2-'0');
                long mul=(Integer.parseInt(num1))*(Integer.parseInt(num2));

        return Long.toString(mul);*/
       


        BigInteger n1 = new BigInteger(num1);
        BigInteger n2 = new BigInteger(num2);
        return n1.multiply(n2).toString();
 
    }
}/* class Solution(object):
    def multiply(self, num1, num2):
        return str(int(num1)*int(num2))*/

        /* 43. Multiply Strings
Solved
Medium
Topics
premium lock icon
Companies
Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.

Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.

 

Example 1:

Input: num1 = "2", num2 = "3"
Output: "6"
Example 2:

Input: num1 = "123", num2 = "456"
Output: "56088"*/