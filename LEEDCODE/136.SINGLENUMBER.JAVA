class Solution {
    public int singleNumber(int[] nums) {   
        HashMap<Integer,Integer> dict=new HashMap<>();
        for (int num : nums) {
            dict.put(num, dict.getOrDefault(num, 0) + 1);
        }
        int max=0;
         for(int n:dict.keySet()){
            if(dict.get(n)==1){
                max= n;
                break;
            }
         }return max;

   }
}




       /* int[] count=new int[Integer.MAX_VALUE];
        for(int num:nums){
            count[num]++;
        }
        int min=Integer.MAX_VALUE;
        int result=1;
        for(int i=0;i<count.length;i++){
           if(min>count[i]&&count[i]!=0){
                min=count[i];
                result=i;
           } 
        }
        return result;*/
/*
        int[] count=new int[100];
        for(int num:nums){
            count[num]++;
        }
        int result=0;
         for(int i=0;i<count.length;i++){
            if(count[i]==1){
                result=i;
            }
         }
  return result;*/

 
/*Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 

Example 1:

Input: nums = [2,2,1]

Output: 1

Example 2:

Input: nums = [4,1,2,1,2]

Output: 4

Example 3:

Input: nums = [1]

Output: 1 */