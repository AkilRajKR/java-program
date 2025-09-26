
class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        /*  int x=0,y=0;
        boolean out=true;
         for(int i=0;i<s3.length();i++){
        //  char c=s3.charAt(i);
        
        if((s1.charAt(x)==(s3.charAt(i)))&&i<s1.length()){
                  x++;
        }else if((s2.charAt(y)==(s3.charAt(i)))&&i<s2.length()){
                  y++;
        } else {
            out=false;
            break;
        }
         }
        
         return out;*/

        if (s1.length() + s2.length() != s3.length())
            return false;
        return result(s1, 0, s2, 0, s3, 0, new Boolean[s1.length() + 1][s2.length() + 1]);
        }

    private boolean result(String s1, int x, String s2, int y, String s3, int i, Boolean[][] bool) {
        if (bool[x][y] != null) return bool[x][y];
        if (i == s3.length())
            return true;
        boolean ans = false;
        if (x < s1.length() && s1.charAt(x) == s3.charAt(i)) {
            ans = result(s1, x + 1, s2, y, s3, i + 1, bool);
        }
        if (!ans && y < s2.length() && s2.charAt(y) == s3.charAt(i)) {
            ans = result(s1, x, s2, y + 1, s3, i + 1, bool);
        }
        return bool[x][y] = ans;
    }
}
/*97. Interleaving String
Solved
Medium
Topics
premium lock icon
Companies
Given strings s1, s2, and s3, find whether s3 is formed by an interleaving of s1 and s2.

An interleaving of two strings s and t is a configuration where s and t are divided into n and m substrings respectively, such that:

s = s1 + s2 + ... + sn
t = t1 + t2 + ... + tm
|n - m| <= 1
The interleaving is s1 + t1 + s2 + t2 + s3 + t3 + ... or t1 + s1 + t2 + s2 + t3 + s3 + ...
Note: a + b is the concatenation of strings a and b.

 

Example 1:


Input: s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac"
Output: true
Explanation: One way to obtain s3 is:
Split s1 into s1 = "aa" + "bc" + "c", and s2 into s2 = "dbbc" + "a".
Interleaving the two splits, we get "aa" + "dbbc" + "bc" + "a" + "c" = "aadbbcbcac".
Since s3 can be obtained by interleaving s1 and s2, we return true.
Example 2:

Input: s1 = "aabcc", s2 = "dbbca", s3 = "aadbbbaccc"
Output: false
Explanation: Notice how it is impossible to interleave s2 with any other string to obtain s3.
Example 3:

Input: s1 = "", s2 = "", s3 = ""
Output: true
  */