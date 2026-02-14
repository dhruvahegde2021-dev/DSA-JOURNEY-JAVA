// Pattern: Arrays
// Time Complexity: O(n logn)
// Space Complexity: O(log n)
class Solution {
    public int singleNumber(int[] nums) {
      if(nums.length==1 || nums.length==0)
        return nums[0];
    Arrays.sort(nums);
      int i=0;
      int j=1;
      while(j<nums.length-1)
      { 
        if(nums[i]==nums[j])
        {
            i=i+2;
            j=j+2;
            continue;
        }
        else
        {
            return nums[i];
        }
      }
      return nums[nums.length-1];
    }
}   