/*
Pattern: Backtracking
Time Complexity: O(2^(T/M)*M), where T is the target and M is the minimal value in candidates
Space Complexity: O(T/M)
*/
class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        res=new ArrayList<>();
        List<Integer> cur=new ArrayList<>();
        dfs(candidates,target,cur,0);
        return res;
    }

    void dfs(int[] candidates,int target,List<Integer> cur,int i)
    {
        if(target==0)
        {
            res.add(new ArrayList<>(cur));
            return;
        }

        if(target<0 || i>=candidates.length)
            return;

        cur.add(candidates[i]);
        dfs(candidates,target-candidates[i],cur,i);
        cur.remove(cur.size()-1);
        dfs(candidates,target,cur,i+1);
    }
}