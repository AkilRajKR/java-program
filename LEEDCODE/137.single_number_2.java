import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> dict=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            dict.put(nums[i],dict.getOrDefault(nums[i], 0) + 1);
        }
        int min=Integer.MAX_VALUE;
        int out=0;
        /*for(int i:dict.keySet()){
            if(min>dict.get(i)){
                out=i;
                min=dict.get(i);
            }*/
        for(int i:dict.keySet()){
            if (dict.get(i) == 1) {
                return i;
            }

        }
      return -1;
    }
}/*137. Single Number II
Solved
Medium
Topics
premium lock icon
Companies
Given an integer array nums where every element appears three times except for one, which appears exactly once. Find the single element and return it.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 

Example 1:

Input: nums = [2,2,3,2]
Output: 3
Example 2:

Input: nums = [0,1,0,1,0,1,99]
Output: 99
  */