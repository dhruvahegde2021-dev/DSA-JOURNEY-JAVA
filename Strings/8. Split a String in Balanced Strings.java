// Pattern: Strings
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public int balancedStringSplit(String s) {
        int bal=0;
        int count=0;
        int i=0;
        while(i<s.length())
        {
            if(s.charAt(i)=='R')
                bal++;
            else
                bal--;
            if(bal==0)
                count++;
            i++;
        }
        return count;
        
    }
}