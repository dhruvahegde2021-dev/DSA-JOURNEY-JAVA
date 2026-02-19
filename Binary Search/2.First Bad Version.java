/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
/*
// Pattern: Binary Search
// Time Complexity: O(log n)
// Space Complexity: O(1)
 */
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low=1;
        int high=n;
        while(low<high)
        {   
            int middle=low+(high-low)/2;
            if(isBadVersion(middle))
            {
                high=middle;
            }
            else
            {
                low=middle+1;
            }
        }
        return low;
    }
}