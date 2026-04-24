// Pattern: Stacks
// Time Complexity: O(n)
// Space Complexity: O(n)
class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st=new Stack<>();
        if(k>=num.length())
            return "0";
        for(int i=0;i<num.length();i++)
        {
            while(!st.isEmpty() && k>0 && num.charAt(i)<st.peek())
            {
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
        }
        while(k>0 && !st.isEmpty())
        {
            st.pop();
            k--;
        }
        if(st.isEmpty())
            return "0";
        StringBuffer res=new StringBuffer();
        while(!st.isEmpty())
        {
            res.append(st.pop());
        }
        res.reverse();
        while(res.length()>1 && res.charAt(0)=='0')
        {
            res.deleteCharAt(0);
        }
        
        return res.toString();
    }
}