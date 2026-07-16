// Pattern: Strings
// Time Complexity: O(n2)
// Space Complexity: O(1)
class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count=0;
        for(String pattern:patterns)
        {
            if(word.contains(pattern))
            {
                count++;
            }
        }
        return count;
    }
}