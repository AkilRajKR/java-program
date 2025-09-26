class Solution {
    public String addBinary(String a, String b) {
        int m = a.length();
        int n = b.length();
        
        int i = m - 1;
        int j = n - 1;
        int carry = 0;
        StringBuilder out = new StringBuilder();

        while (i >= 0 || j >= 0 || carry > 0) {
            int x = (i >= 0) ? a.charAt(i) - '0' : 0;
            int y = (j >= 0) ? b.charAt(j) - '0' : 0;

            int sum = x + y + carry;
            out.append(sum % 2);   // add current bit
            carry = sum / 2;       // update carry

            i--;
            j--;
        }

        return out.reverse().toString();
    }
}
/*67. Add Binary
Solved
Easy
Topics
premium lock icon
Companies
Given two binary strings a and b, return their sum as a binary string.

 

Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101" */