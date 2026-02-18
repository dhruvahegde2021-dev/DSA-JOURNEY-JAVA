// Pattern: Stacks
// Time Complexity: O(n.m)
// Space Complexity: O(n)
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] nextGreater= new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int current=nums[i];
            int res=-1;
            for(int j=1;j<nums.length;j++)
            {   int index=(i+j)%nums.length;
                if(nums[index]>current)
                   {
                    res=nums[index];
                    break;
                   } 
            }
            nextGreater[i]=res;
        }
        return nextGreater;
    }
}