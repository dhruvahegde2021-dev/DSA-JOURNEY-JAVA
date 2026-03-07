// Pattern: Arrays
// Time Complexity: O(n)
// Space Complexity: O(n)
class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> positive=new ArrayList<>();
        ArrayList<Integer> negative=new ArrayList<>();
        for(int i:nums)
        {
            if(i>=0)
                positive.add(i);
            else
                negative.add(i);
        }
        int index=0,i=0,j=0;
        while(i<positive.size() && j<negative.size())
        {
            if(index%2==0)
            {
                nums[index]=positive.get(i);
                i++;
            }
            else
            {
                nums[index]=negative.get(j);
                j++;
            }
             index++;
        }

        while(i<positive.size())
            nums[index++]=positive.get(i++);

        while(j<negative.size())
            nums[index++]=negative.get(j++);
        return nums;

    }
}