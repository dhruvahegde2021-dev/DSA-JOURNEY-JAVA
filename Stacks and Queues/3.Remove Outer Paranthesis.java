// Pattern: Stacks
// Time Complexity: O(n)
// Space Complexity: O(n)
class Solution {
    public String removeOuterParentheses(String s) {
        StringBuffer res=new StringBuffer();
        int op=0;
        for(Character c:s.toCharArray())
        {
            if(c=='(')
                {
                    if(op>0)
                        res.append(c);
                op++;
                }
            else{
                op--;
                if(op>0)
                    res.append(c);
            }
        }
    return res.toString();
    }
}