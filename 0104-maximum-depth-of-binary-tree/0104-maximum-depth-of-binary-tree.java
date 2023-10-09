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
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        else
            return maxDepthHelper(root);
    }
    
    public int maxDepthHelper(TreeNode node) {
        if(node == null)
            return 0;
        else {
            int leftDepth = maxDepthHelper(node.left);
            int rightDepth = maxDepthHelper(node.right);
            return Math.max(leftDepth, rightDepth) + 1;
        }
    }
}