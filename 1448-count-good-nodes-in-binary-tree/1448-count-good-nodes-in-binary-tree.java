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
    
    public static int count = 0;
    public int goodNodes(TreeNode root) {
        
        return dfs(root, Integer.MIN_VALUE);
    }
    
    public int dfs(TreeNode current, int maxVal) {
        if(current == null) {
            return 0;
        }
        count = 0;
        
        if(current.val >= maxVal) {
            count++;
            maxVal = current.val;
        }
        
        count += dfs(current.left, maxVal);
        count += dfs(current.right, maxVal);
            
        return count;
    }
}