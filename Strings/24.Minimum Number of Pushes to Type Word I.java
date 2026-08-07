// Pattern: Strings
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public int minimumPushes(String word) {
        int pushes=0;
        for(int i=0;i<word.length();i++)
        {   
            pushes+=(i/8+1);
        }
        return pushes;
    }
}