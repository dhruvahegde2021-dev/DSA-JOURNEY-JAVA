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
 *  // Pattern: Trees
// Time Complexity: O(n)
// Space Complexity: O(1)
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
       return Height(root)!=-1;
    }
    int Height(TreeNode root)
    {
        if(root==null)
            return 0;
        
        int leftHeight=Height(root.left);
        int rightHeight=Height(root.right);
        if(leftHeight==-1)
            return -1;
        if(rightHeight==-1)
            return -1;
        if(Math.abs(leftHeight-rightHeight)>1)
            return -1;
        return 1+Math.max(leftHeight,rightHeight);
    }
}