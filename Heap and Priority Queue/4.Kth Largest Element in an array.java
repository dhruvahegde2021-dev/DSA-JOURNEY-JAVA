// Pattern:Heap and Priority Queue
// Time Complexity: O(nlog n)
// Space Complexity: O(n)
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minheap=new PriorityQueue<>();
        for(int num:nums)
        {
            minheap.offer(num);
        }

        int count=0;
        while(count!=(nums.length-k))
        {
            minheap.poll();
            count++;
        }
        return minheap.peek();
    }
}