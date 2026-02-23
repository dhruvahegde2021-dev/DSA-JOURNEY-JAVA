// Pattern: Sliding Window
// Time Complexity: O(n)
// Space Complexity: O(n)
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] seen=new int[128];
        Arrays.fill(seen,-1);
        int left=0;
        int maxLength=0;
        for(int right=0;right<s.length();right++)
        {
            char c=s.charAt(right);
            if(seen[c]>=left)
            {
                left=seen[c]+1;
            }
            seen[c]=right;
            maxLength=Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }
}