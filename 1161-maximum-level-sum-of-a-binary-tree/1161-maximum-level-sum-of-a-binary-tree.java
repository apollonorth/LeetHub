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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> output = new LinkedList<>();
        output.offer(root);
        int level = 1;
        int sum = 0;
        int levelSize = 1;
        int maxSum = Integer.MIN_VALUE;
        int levelOfMaxSum = 1;
        TreeNode current = root;
        while(!output.isEmpty()) {
            sum = 0;
            levelSize = output.size();
            for(int i = 0; i < levelSize; i++) {
                current = output.poll();
                sum += current.val;
                if(current.left != null)
                    output.offer(current.left);
                if(current.right != null) 
                    output.offer(current.right);
            }
            if (sum > maxSum) {
                maxSum = sum;
                levelOfMaxSum = level;
            }
            level++;
        }
        
        return levelOfMaxSum;
    }
}