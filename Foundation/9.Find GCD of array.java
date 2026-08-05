// Pattern: Maths
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public int findGCD(int[] nums) {
        int min=nums[0];
        int max=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<min)
            {
                min=nums[i];
            }
        }
         for(int i=0;i<nums.length;i++)
         {
            
            if(nums[i]>max)
            {
                max=nums[i];
            }
         }
        int rem=0;
        while(max!=0)
        {
            rem=min%max;
            min=max;
            max=rem;
        }
        return min;
    }
}