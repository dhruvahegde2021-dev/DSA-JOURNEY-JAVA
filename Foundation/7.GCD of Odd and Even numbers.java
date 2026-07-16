// Pattern: Maths
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public int gcdOfOddEvenSums(int n) {
        int oddSum=n*n;
        int evenSum=n*(n+1);
        int a=oddSum;
        int b=evenSum;
        int rem=0;
        while(b!=0)
        {
            rem=a%b;
            a=b;
            b=rem;
        }
        return a;
    }
}