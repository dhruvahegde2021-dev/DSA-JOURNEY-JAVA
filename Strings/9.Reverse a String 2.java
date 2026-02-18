// Pattern: Strings
// Time Complexity: O(n)
// Space Complexity: O(n)
class Solution {
    public String reverseStr(String s, int k) {
        char[] a=s.toCharArray();
        for(int st=0;st<a.length;st+=2*k)
        {
            int i=st;
            int j=Math.min(st+k-1,a.length-1);
            while(i<j)
            {
                char temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
                j--;
            }
        }    
        String f=new String(a);
        return f;  
        }
}