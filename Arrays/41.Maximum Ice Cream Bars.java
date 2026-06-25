// Pattern: Arrays
// Time Complexity: O(nlogn)
// Space Complexity: O(1)
class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int n=costs.length;
        Arrays.sort(costs);
        int sum=0;
        for(int i=0;i<n;i++)
                {
                    if(coins>=costs[i])
                    {
                        coins=coins-costs[i];
                        sum++;
                    }
                    else
                    {
                        break;
                    }
                }
            return sum;
    }
}