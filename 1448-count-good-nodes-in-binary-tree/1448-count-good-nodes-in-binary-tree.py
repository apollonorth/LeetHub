# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def goodNodes(self, root: TreeNode) -> int:
        return self.dfs(root, float('-inf'))
    
    def dfs(self, current, maxVal):
        if not current: 
            return 0
        
        count = 0;
        
        if current.val >= maxVal:
            count += 1
            maxVal = current.val
            
        count += self.dfs(current.left, maxVal)
        count += self.dfs(current.right, maxVal)
        
        return count