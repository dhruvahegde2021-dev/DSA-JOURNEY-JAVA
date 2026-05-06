// Pattern: Sliding Window
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int sum=0;
        for(int point:cardPoints)
            sum+=point;
        if(k==n)
            return sum;
        int windowSize=n-k;
        if(windowSize==0)
            return windowSize;
        int currentWindowSum=0;
        for(int i=0;i<windowSize;i++)
        {
            currentWindowSum+=cardPoints[i];
        }
        int minSum=currentWindowSum;
        for(int i=windowSize;i<n;i++)
        {
            currentWindowSum+=cardPoints[i]-cardPoints[i-windowSize];
            minSum=Math.min(minSum,currentWindowSum);
        }
        int max=sum - minSum;
        return max;
    }
}