// Pattern: Strings
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public String removeTrailingZeros(String num) {
        int count=0;
        for(int i=num.length()-1;i>=0;i--)
        {
            if(num.charAt(i)=='0')
            {
                count++;
            }
            else
                break;
        }
        if(count==0)
            return num;
        else
            return(num.substring(0,num.length()-count));
    }
}