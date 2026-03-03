// Pattern: Arrays
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public boolean isSorted(int[] arr) {
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]<=arr[i+1])
                continue;
            else
                return false;
        }
        return true;
        
    }
}