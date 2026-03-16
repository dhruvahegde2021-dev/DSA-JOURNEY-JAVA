// Pattern: Strings
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] a=new int[256];
        int[] b=new int[256];
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            if(a[s.charAt(i)]!=b[t.charAt(i)])
                return false;
            a[s.charAt(i)]=i+1;
            b[t.charAt(i)]=i+1;
        }
        return true;
    }
}