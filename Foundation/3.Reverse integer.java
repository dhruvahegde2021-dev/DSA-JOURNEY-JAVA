// Pattern: String based Manipulation
// Time Complexity: O(n)
// Space Complexity: O(n)
// Notes: Using string and stringbuffer
class Solution {
    public int reverse(int x) {
        long y=0;
        if(x>0)
        {
            String s=Integer.toString(x);
            StringBuffer sb=new StringBuffer(s);
            String a=sb.reverse().toString();
            y=Long.parseLong(a);
        }
        else
        {
            long num=Math.abs((long)x);
            String s=Long.toString(num);
            StringBuffer sb=new StringBuffer(s);
            String a= "-"+sb.reverse().toString();
             y=Long.parseLong(a);
        }

        if(y>Integer.MAX_VALUE || y<Integer.MIN_VALUE)
            return 0;
        return (int) y;
    }
}