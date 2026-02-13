// Pattern: Array Traversal
// Time Complexity: O(log n)
// Space Complexity: O(1)
// Notes: Simple max tracking
class Solution {
    public int search(int[] nums, int target) {
        int f=0 , r=nums.length-1;
        while(f<=r)
        {
            int middle=(f+r)/2;
            if(nums[middle]==target)
            {
                return middle;
            }
            else if(nums[middle]<target)
                f=middle+1;
            else
                r=middle-1;
        }
        return -1;
    }
}