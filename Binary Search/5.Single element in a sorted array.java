// Pattern: Binary Search
// Time Complexity: O(log n)
// Space Complexity: O(1)
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low=0;
        int high=nums.length-1;
        while(low<high)
        {
            int middle=low+(high-low)/2;
            if(middle%2==1)
                middle--;
            if(nums[middle]==nums[middle+1])
                low=middle+2;
            else
                high=middle;
        }
        return nums[low];
    }
}