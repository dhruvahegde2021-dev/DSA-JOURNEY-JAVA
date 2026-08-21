// Pattern:Heap and Priority Queue
// Time Complexity: O(nlogn)
// Space Complexity: O(n)
class KthLargest {
    PriorityQueue<Integer> minheap;
    int k;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        this.minheap=new PriorityQueue<>();
        for(int num:nums)
        {
            minheap.offer(num);
            if(minheap.size()>k)
                minheap.poll();
        }
    }
    
    public int add(int val) {
        minheap.offer(val);
        if(minheap.size()>k)
            minheap.poll();
        return minheap.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */