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
// Space Complexity: O(n)
 * }
 */
class Solution {
    int pre_index=0;
    HashMap<Integer,Integer> map=new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++)
        {
            map.put(inorder[i],i);
        }
        return dfs(preorder,0,inorder.length-1);
    }

    public TreeNode dfs(int preorder[],int left,int right)
    {
        if(left>right)
            return null;
        int root_val=preorder[pre_index++];
        TreeNode root=new TreeNode(root_val);
        int mid=map.get(root_val);
        root.left=dfs(preorder,left,mid-1);
        root.right=dfs(preorder,mid+1,right);
        return root;
    }
}
