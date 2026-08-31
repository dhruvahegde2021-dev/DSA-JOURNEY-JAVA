/*
Pattern: Backtracking
Time Complexity: O(4^n/sqrt(n)), where n is the number of pairs
Space Complexity: O(n)
*/
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        StringBuilder str=new StringBuilder();
        dfs(0,0,res,str,n);
        return res;
    }

    void dfs(int openP , int closedP , List<String> res , StringBuilder str , int n)
    {
        if(openP==closedP && openP==n)
            {
                res.add(str.toString());
                return;
            }
        
        if(openP<n)
        {
            str.append('(');
            dfs(openP+1,closedP,res,str,n);
            str.deleteCharAt(str.length()-1);
        }

        if(closedP<openP)
        {
            str.append(')');
            dfs(openP,closedP+1,res,str,n);
            str.deleteCharAt(str.length()-1);
        }
    }
}