// Pattern: Strings
// Time Complexity: O(n*m)
// Space Complexity: O(n+m)
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        char[] a=jewels.toCharArray();
        char[] b=stones.toCharArray();
        int count=0;
        for(Character x:a)
        {
             for(Character y:b)
            {
                if(x==y)
                    count++;
                else 
                    continue;
                
            }
        }
        return count;
    }
}