import java.util.*;
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        backtrack(result,new ArrayList<>(),nums,new boolean [nums.length]);
        return result;
    }

    private void backtrack(List<List<Integer>> result,ArrayList<Integer> temp,int[] nums,boolean[] used){

    if(temp.size()==nums.length && !result.contains(temp)){
        result.add(new ArrayList<>(temp));
        return;
    }
        for(int i=0;i<nums.length;i++){

    if(used[i]) continue;

    used[i]=true;
    temp.add(nums[i]);
    backtrack(result,temp,nums,used);
    used[i]=false;
    temp.remove(temp.size()-1);
        }
    }
}/*47. Permutations II
Solved
Medium
Topics
premium lock icon
Companies
Given a collection of numbers, nums, that might contain duplicates, return all possible unique permutations in any order.

 

Example 1:

Input: nums = [1,1,2]
Output:
[[1,1,2],
 [1,2,1],
 [2,1,1]]
Example 2:

Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
  */