// Pattern: Arrays
// Time Complexity: O(n)
// Space Complexity: O(n)
// Notes: Using LinkedHashSet JFC and iterator
class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> s=new LinkedHashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            s.add(nums[i]);
        }
        int index=0;
        for(int i:s)
        {
            nums[index]=i;
            index++;
        }  
        return index;
    }
}