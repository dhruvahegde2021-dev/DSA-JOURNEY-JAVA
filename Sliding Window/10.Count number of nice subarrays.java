// Pattern: Sliding Window
// Time Complexity: O(n)
// Space Complexity: O(n)
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int oddCount=0,count=0;
        for(int num:nums)
        {
            if(num%2==1)
            {
                oddCount++;
            }

            if(map.containsKey(oddCount-k))
            {
                count=count+map.get(oddCount-k);
            }
            map.put(oddCount,map.getOrDefault(oddCount,0)+1);
        }
        return count;
    }
}