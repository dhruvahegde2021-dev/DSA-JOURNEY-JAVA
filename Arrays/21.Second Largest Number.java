// Pattern: Arrays
// Time Complexity: O(n logn)
// Space Complexity: O(1)
class Solution {
    public int getSecondLargest(int[] arr) {
        Arrays.sort(arr);
        int j=arr.length-1;
        while(j>=1)
        {
            if(arr[j]==arr[j-1])
            {
                j--;
            }
            else
            {
                return arr[j-1];
            }
        }
        return -1;
        
        
    }
}