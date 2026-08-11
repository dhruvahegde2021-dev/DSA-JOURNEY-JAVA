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
 *  *  // Pattern: Trees
// Time Complexity: O(n)
// Space Complexity: O(1)
 */
class Solution {
    int res=0;

    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return res;    
    }

    public int dfs(TreeNode root)
    {
        if(root==null)
            return 0;
        
        int lh=dfs(root.left);
        int rh=dfs(root.right);

        res=Math.max(res,lh+rh);
        return 1+Math.max(lh,rh);
    }
}