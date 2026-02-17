// Pattern: Strings
// Time Complexity: O(n)
// Space Complexity: O(n)
// Notes: Simple max tracking
class Solution {
    public int lengthOfLastWord(String s) {
        String c=s.trim();
        int a=c.lastIndexOf(" ");
        String b=c.substring(a+1,c.length());
        return(b.length());
    }
}