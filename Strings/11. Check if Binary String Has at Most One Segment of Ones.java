// Pattern: Strings
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public boolean checkOnesSegment(String s) {
        int left=s.indexOf('1');
        int right=s.lastIndexOf('1');
        if(left==-1)
            return true;
        else if(right==-1)
            return false;
        for(int i=left+1;i<right;i++)
        {
            if(s.charAt(i)!='1')
                return false;
            else
                continue;
        }
        return true;

    }
}