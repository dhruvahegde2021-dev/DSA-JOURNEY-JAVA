/*
Pattern: Backtracking
Time complexity: O(2^n)
Space complexity: O(n)
*/
class Solution {
    List<List<String>> res;
    public List<List<String>> partition(String s) {
        res=new ArrayList<>();
        List<String> part=new ArrayList<>();
        dfs(s,0,part);
        return res;
    }

    void dfs(String s, int i,List<String> part)
    {
        if(i>=s.length())
        {
            res.add(new ArrayList<>(part));
            return;
        }

        for(int j=i;j<s.length();j++)
        {
            if(isPalindrome(s,i,j))
            {
                part.add(s.substring(i,j+1));
                dfs(s,j+1,part);
                part.remove(part.size()-1);
            }
        }
    }

    boolean isPalindrome(String s , int left, int right)
    {
        while(left<right)
        {
            if(s.charAt(left)!=s.charAt(right))
                return false;
            else
                {
                    left=left+1;
                    right=right-1;
                }
        }
        return true;
    }
}