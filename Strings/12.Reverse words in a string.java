// Pattern: Strings
// Time Complexity: O(n)
// Space Complexity: O(n)
class Solution {
    public String reverseWords(String s) {
        String []words=s.trim().split("\s+");
        StringBuffer sb=new StringBuffer();
        for(int i=words.length-1;i>=0;i--)
        {
            sb.append(words[i] +" ");
        }
        return sb.toString().trim();
    }
}