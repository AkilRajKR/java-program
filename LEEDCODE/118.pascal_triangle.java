import java.util.*;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<>();
       if (numRows==0) return result;
        List<Integer> first=new ArrayList<>();
        first.add(1);
        result.add(first);

        if (numRows==1) return result;
        for(int i=1;i<numRows;i++){
            List<Integer> prevrow=result.get(i - 1);
            List<Integer> rows=new ArrayList<>();

            rows.add(1);
            for(int j=0;j<prevrow.size()-1;j++){
                  rows.add(prevrow.get(j+1)+prevrow.get(j));
            }
             rows.add(1);
             result.add(rows);
        }
         return result;
    }
   
}/*118. Pascal's Triangle
Solved
Easy
Topics
premium lock icon
Companies
Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:


 

Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]] */