// Pattern: Strings
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public String largestOddNumber(String num) {
        String odd="";
        String temp="";
        if(num.isEmpty())
            return num;
        for(int i=1;i<=num.length();i++)
        {
            temp=num.substring(0,i);
            char c=temp.charAt(temp.length()-1);
            if(c=='1'||c=='3' || c=='5' || c=='7' || c=='9')
                odd=temp;
            else
                continue;
        }
        return odd;
    }
}