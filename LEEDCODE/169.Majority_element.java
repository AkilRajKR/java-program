import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
       int maxCount = 0;
       int majority = nums[0];

        Set<Integer> du = new HashSet<>();
        for (int m : nums) {
            du.add(m);
        }

        List<Integer> li = new ArrayList<>(du);

        for (int val : li) {
            int count = 0;
            for (int num : nums) {
                if (num == val) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                majority = val;
            }
        }

        return majority;
     /*
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;*/

    }
}
/*169. Majority Element
Solved
Easy
Topics
premium lock icon
Companies
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2 */