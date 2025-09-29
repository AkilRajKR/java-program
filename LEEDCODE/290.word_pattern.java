import java.util.*;
class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character,String> pattos=new HashMap<>();
        Map<String,Character> stopat=new HashMap<>();
        String[] words=s.split(" ");
        if(pattern.length()!=words.length) return false;
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            String word=words[i];

            if(pattos.containsKey(ch)){
                if(!pattos.get(ch).equals(word)) return false;
            }else{
                pattos.put(ch,word);
            }
            if(stopat.containsKey(word)){
                if(!stopat.get(word).equals(ch)) return false;
            }else{
                stopat.put(word,ch);
            }


        }
        return true;
         
    }
}/*290. Word Pattern
Solved
Easy
Topics
premium lock icon
Companies
Given a pattern and a string s, find if s follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s. Specifically:

Each letter in pattern maps to exactly one unique word in s.
Each unique word in s maps to exactly one letter in pattern.
No two letters map to the same word, and no two words map to the same letter.
 

Example 1:

Input: pattern = "abba", s = "dog cat cat dog"

Output: true

Explanation:

The bijection can be established as:

'a' maps to "dog".
'b' maps to "cat".
Example 2:

Input: pattern = "abba", s = "dog cat cat fish"

Output: false

Example 3:

Input: pattern = "aaaa", s = "dog cat cat dog"

Output: false */