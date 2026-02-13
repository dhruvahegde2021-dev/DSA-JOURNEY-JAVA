
// Pattern:Basics
// Time Complexity: O(N)
// Space Complexity: O(N)
// Notes: String and StringBuffer usage
class Solution {
    public boolean isPalindrome(int x) {
        String s=Integer.toString(x);
        StringBuffer srev=new StringBuffer(s);
        srev.reverse();
        String s1=srev.toString();
        if(s.equals(s1))
            return true;
        return false;
    }
}