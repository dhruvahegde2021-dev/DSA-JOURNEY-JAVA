// Pattern: Arrays
// Time Complexity: O(n)
// Space Complexity: O(n)
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket=new ArrayList[nums.length+1];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(int res:map.keySet())
        {
            int freq=map.get(res);
            if(bucket[freq]==null)
            {
                bucket[freq]=new ArrayList<>();
            }
            bucket[freq].add(res);
        }

        int [] finalAns=new int[k];
        int count=0;
        for(int i=bucket.length-1;i>=0 && count<k ;i--)
        {
            if(bucket[i]!=null)
                {
                    for(int j:bucket[i])
                    {
                        finalAns[count++]=j;
                    }
                }
        }
        return finalAns;
    }
}