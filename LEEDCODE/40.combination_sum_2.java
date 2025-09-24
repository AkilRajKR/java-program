import java.util.*;
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        
        List<List<Integer>> result=new ArrayList<>();
        backtrack(candidates,target,new ArrayList<>(),0,result);
        return result;
    }

    private void backtrack(int[] candidates, int target,List<Integer> temp,int s,List<List<Integer>> result){

        if(target==0){
            result.add(new ArrayList<>(temp));
            return;
        }

        for(int i=s;i<candidates.length;i++){
            if (i > s && candidates[i] == candidates[i - 1]) continue;

                if(candidates[i]>target){
                    break;
                }else{
                    temp.add(candidates[i]);
                    backtrack(candidates,target-candidates[i],temp,i+1,result);
                    temp.remove(temp.size()-1);
                }
        }
    }
}/*40. Combination Sum II
Solved
Medium
Topics
premium lock icon
Companies
Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sum to target.

Each number in candidates may only be used once in the combination.

Note: The solution set must not contain duplicate combinations.

 

Example 1:

Input: candidates = [10,1,2,7,6,1,5], target = 8
Output: 
[
[1,1,6],
[1,2,5],
[1,7],
[2,6]
]
Example 2:

Input: candidates = [2,5,2,1,2], target = 5
Output: 
[
[1,2,2],
[5]
] */