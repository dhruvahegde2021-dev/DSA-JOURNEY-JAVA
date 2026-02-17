// Pattern: Strings
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String a=s.replaceAll("[^a-zA-Z0-9]","");
        int left=0;
        int right=a.length()-1;
        while(left<right)
        {
            if(a.charAt(left)==a.charAt(right))
             { 
                left++;
                right--;
                continue;
             }
             else
             {
                return false;
             }
        }
        return true;
    }
}