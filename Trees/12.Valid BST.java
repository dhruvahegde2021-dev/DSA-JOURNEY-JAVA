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
 * // Pattern: Trees
// Time Complexity: O(n)
// Space Complexity: O(1)
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        return Valid(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }

    public boolean Valid(TreeNode root,long minVal , long maxVal)
    {
        if(root==null)
            return true;
        if(root.val>=maxVal || root.val<=minVal)
            return false;
        return (Valid(root.left,minVal,root.val) && Valid(root.right,root.val,maxVal));
    }
}