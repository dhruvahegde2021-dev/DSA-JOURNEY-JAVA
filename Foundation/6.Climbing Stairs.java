// Pattern: Memorization
// Time Complexity: O(n)
// Space Complexity: O(n)
class Solution {
    public int climbStairs(int n) {
        if(n<=2)
            return n;
        int prev=1;
        int current =2;
        for(int i=3;i<=n;i++)
        {
            int next=prev+current;
            prev=current;
            current=next;
        }
        return current;
    }
}