// Pattern: Arrays
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int current=0;
        int max=0;
        for(int num:nums)
        {
            if(num==1)
                {
                    current++;
                    max=Math.max(max,current);
                }
            else
            {
                current=0;
            }
        }
    return max;
    }
}