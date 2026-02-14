// Pattern: Arrays and sorting
// Time Complexity: O((m+n)(log (m+n)))
// Space Complexity: O(log(m+n))
// Notes: combine and sort
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int j=0;
        if(nums2.length==0)
        {
            System.out.println(nums1);
        }
        else if(nums1.length==0)
        {
            System.out.println(nums2);
        }
        else{
            while(i<m+n && j<n)
        {
            if(i==m)
            {
                while(i<m+n)
                {
                    nums1[i]=nums2[j];
                    i++;
                    j++;
                }
            }
            else
            {
                i++;
                continue;
            }
        }
        Arrays.sort(nums1);
        }
    }
}