// Pattern: Arrays
// Time Complexity: O(n)
// Space Complexity: O(n)
class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] res=new int[nums.length];
        Arrays.fill(res,1);
        int max=1;
        int n=nums.length;
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(nums[j]<nums[i])
                {
                    res[i]=Math.max(res[i],res[j]+1);
                }
            }
            max=Math.max(max,res[i]);
        }
        return max;
    }
}