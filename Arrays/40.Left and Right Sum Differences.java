// Time Complexity: O(n)
// Space Complexity: O(n)
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int leftSum=0;
        int rightSum=0;
        int[] res=new int[nums.length];
        for(int num:nums)
        {
            rightSum+=num;
        }

        for(int i=0;i<nums.length;i++)
        {
            rightSum=rightSum-nums[i];
            res[i]=Math.abs(leftSum-rightSum);
            leftSum+=nums[i];
        }
        return res;
    }
}