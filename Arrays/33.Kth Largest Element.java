// Pattern: Arrays
// Time Complexity: O(nlog n)
// Space Complexity: O(n)
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int count=0;
        int n=nums.length;
        for(int num:nums)
        {
            pq.add(num);
        }
        while(count!=(n-k))
        {
            count++;
            pq.poll();
        }
        return pq.peek();
    }
}