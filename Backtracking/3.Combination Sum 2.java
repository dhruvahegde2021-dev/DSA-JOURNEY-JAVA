/*
Pattern: Backtracking
Time Complexity: O(N*2^N), where N is the number of candidates
Space Complexity: O(K*N), where K is the average length of each combination
*/

class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        res=new ArrayList<>();
        List<Integer> cur=new ArrayList<>();
        Arrays.sort(candidates);
        dfs(candidates,target,0,new ArrayList<>(),0);
        return res;
    }

    void dfs(int[] candidates , int target ,int i, List<Integer> cur, int total )
    {
        if(total==target)
        {
            res.add(new ArrayList<>(cur));
            return;
        }

        if(total>target || i>=candidates.length)
            return;

        cur.add(candidates[i]);
        dfs(candidates,target,i+1,cur,total+candidates[i]);

        cur.remove(cur.size()-1);
        while(i+1 < candidates.length && candidates[i]==candidates[i+1])
        {
            i+=1;
        }
        dfs(candidates,target,i+1,cur,total);
    }
}