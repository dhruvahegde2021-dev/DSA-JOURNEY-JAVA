// Pattern: Arrays
// Time Complexity: O(n+(log n))
// Space Complexity: O(log n)
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==i)
                continue;
            else
                return i;
        }
        return nums.length;
    }
}