// Pattern: Arrays
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public void rotate(int[] arr) {
        int last=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[0]=last;
    }
}