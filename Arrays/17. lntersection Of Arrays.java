// Pattern: Arrays
// Time Complexity: O(m+n)
// Space Complexity: O(n)
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> st=new HashSet<>();
        for(Integer i:nums1)
        {
            st.add(i);
        }
        HashSet<Integer> st2=new HashSet<>();
        for(Integer j:nums2)
        {
            if(st.contains(j))
            {
                st2.add(j);
            }
        }
    return st2.stream().mapToInt(Integer::intValue).toArray();
    }
}
