// Pattern: Arrays
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public static int largest(int[] arr) {
        int largest=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)
                largest=arr[i];
        }
        return largest;
    }
}
