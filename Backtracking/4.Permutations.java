/*
  Pattern: Backtracking
  Time Complexity: O(n*n!)
  Space Complexity: O(n)
 */


class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> permute(int[] nums) {
        res=new ArrayList<>();
        List<Integer> perm=new ArrayList<>();
        dfs(nums,perm,new boolean[nums.length]);
        return res;
    }

    void dfs(int[] nums, List<Integer> perm , boolean[] pick)
    {
        if(perm.size()==nums.length)
        {
            res.add(new ArrayList<>(perm));
            return;
        }

        for(int i=0;i<nums.length;i++)
        {
            if(!pick[i])
            {
                perm.add(nums[i]);
                pick[i]=true;
                dfs(nums,perm,pick);
                perm.remove(perm.size()-1);
                pick[i]=false;
            }
        }
    }
}