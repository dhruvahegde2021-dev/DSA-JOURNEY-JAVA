// Pattern: Arrays
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public int minElement(int[] nums) {
        int k=0;
        for(int num:nums)
        {
            int sum=0;
            int temp=num;
            while(temp!=0)
            {
                int dig=temp%10;
                sum+=dig;
                temp=temp/10;
            }
            nums[k]=sum;
            k++;
        }
        int min=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<min)
                min=nums[i];
        }
        return min;
    }
}