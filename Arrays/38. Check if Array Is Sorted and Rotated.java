// Pattern: Arrays
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public boolean check(int[] nums) {
        int discontinue=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i]>nums[(i+1)%n])
                discontinue++;
        }
        if(discontinue<=1)
            return true;
        else
            return false;
    }
}