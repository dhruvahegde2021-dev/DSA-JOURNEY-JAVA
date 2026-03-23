// Pattern: Strings
// Time Complexity: O(n)
// Space Complexity: O(n)
class Solution {
    public int maxDepth(String s) {
        int ans=0;
        int depth=0;
        for(Character c:s.toCharArray())
        {
            if(c=='(')
            {
                depth++;
                ans=Math.max(ans,depth);
            }
            else if(c==')')
                depth--;
        }
        return ans;
    }
}