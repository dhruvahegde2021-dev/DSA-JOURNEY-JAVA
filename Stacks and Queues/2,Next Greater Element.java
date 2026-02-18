// Pattern: Stacks
// Time Complexity: O(n.m)
// Space Complexity: O(n)
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
      int[] nextGreater= new int[nums1.length];
      for(int i=0;i<nums1.length;i++)
      {
        int current=nums1[i];
        int found=-1;
        for(int j=0;j<nums2.length;j++)
        {
            if(nums2[j]==current)
            {
                found=j;
                break;
            }      
        }
        int res=-1;
        for(int j=found+1;j<nums2.length;j++)
        {
            if(nums2[j]>current)
            {
                res=nums2[j];
                break;
            }
        }
        nextGreater[i]=res;
    }
    return nextGreater;
    }
}