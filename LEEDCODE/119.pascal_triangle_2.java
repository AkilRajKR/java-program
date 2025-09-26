
import java.util.*;
class Solution {
    public List<Integer> getRow(int rowIndex) {
       List<List<Integer>> result=new ArrayList<>();
        

        List<Integer> first=new ArrayList<>();
        first.add(1);
        result.add(first);
        if(rowIndex==0) return result.get(rowIndex);

        for(int i=1;i<=rowIndex;i++){
            List<Integer> prev=result.get(i-1);

            List<Integer> row=new ArrayList<>();
            row.add(1);
            for(int j=0;j<prev.size()-1;j++){
                row.add(prev.get(j)+prev.get(j+1));
            }
            row.add(1);
            result.add(row);
        }
        
        return result.get(rowIndex);

    }
}/*119. Pascal's Triangle II
Solved
Easy
Topics
premium lock icon
Companies
Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:


 

Example 1:

Input: rowIndex = 3
Output: [1,3,3,1]
Example 2:

Input: rowIndex = 0
Output: [1]
Example 3:

Input: rowIndex = 1
Output: [1,1]
 

Constraints: */