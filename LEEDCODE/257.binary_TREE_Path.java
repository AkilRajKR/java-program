
import java.util.*;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */


class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result=new ArrayList<>();
        dfs(result,root,"");
        return result;
    }

    void dfs(List<String> result,TreeNode root,String path){
        if(root==null) return;
        path+=Integer.toString(root.val);
        //path+="->"
        dfs(result,root.left,path+"->");
        dfs(result,root.right,path+"->");
        if(root.left==null&&root.right==null){
        result.add(path);
        }
    }
}/*257. Binary Tree Paths
Solved
Easy
Topics
premium lock icon
Companies
Given the root of a binary tree, return all root-to-leaf paths in any order.

A leaf is a node with no children.

 

Example 1:


Input: root = [1,2,3,null,5]
Output: ["1->2->5","1->3"]
Example 2:

Input: root = [1]
Output: ["1"] */