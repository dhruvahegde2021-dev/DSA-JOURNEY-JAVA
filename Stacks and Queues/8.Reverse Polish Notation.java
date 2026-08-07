class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(String c:tokens)
        {
            if(c.equals("+"))
            {
                st.push(st.pop()+st.pop());
            }
            else if(c.equals("-"))
            {
                int temp=st.pop();
                st.push(st.pop()-temp);
            }
            else if(c.equals("*"))
            {
                st.push(st.pop()*st.pop());
            }
            else if(c.equals("/"))
            {
                int temp=st.pop();
                st.push(st.pop()/temp);
            }
            else
            {
                st.push(Integer.parseInt(c));
            }
        }
        return st.pop();
    }
}