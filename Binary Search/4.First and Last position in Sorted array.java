
// Pattern: Binary Search
// Time Complexity: O(log n)
// Space Complexity: O(1)
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res={-1,-1};
        int low=0;
        int  high=nums.length-1;
        if(nums.length==1)
        {
            if(nums[low]==target)
            {
                res[0]=0;
                res[1]=0;
            }
            
        }
        while(low<=high)
        {  
            int mid=low+(high-low)/2;
            if(nums[mid]>=target)
            {
                high=mid-1;
            }
            else
                low=mid+1;
        }
         if(low>=nums.length || nums[low]!=target)
        return res;
        res[0]=low;

        high=nums.length-1;
        while(low<=high)
        {  
           int mid=low+(high-low)/2;
            if(nums[mid]<=target)
            {
                low=mid+1;
            }
            else
                high=mid-1;
        }
        res[1]=high;
        return res;
    }
}