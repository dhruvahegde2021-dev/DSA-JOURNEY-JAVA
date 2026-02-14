// Pattern: Arrays
// Time Complexity: O(n)
// Space Complexity: O(1)
// Notes: Swap if element not zero
class Solution {
    public void moveZeroes(int[] nums) {
        int left=0;
        for(int right=0;right<nums.length;right++)
        {
            if(nums[right]!=0)
            {
                int temp=nums[right];
                nums[right]=nums[left];
                nums[left]=temp;
                left++;
            }
        }
        
    }
}