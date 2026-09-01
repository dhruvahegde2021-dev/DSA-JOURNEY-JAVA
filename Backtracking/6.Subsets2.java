/*
Pattern: Backtracking
Time complexity: O(2^n)
Space complexity: O(n)
*/
class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        res=new ArrayList<>();
        List<Integer> subset=new ArrayList<>();
        Arrays.sort(nums);
        dfs(nums,0,subset);
        return res;
    }

    void dfs(int [] nums,int i,List<Integer> subset)
    {
        if(i==nums.length)
            {
                res.add(new ArrayList<>(subset));
                return;
            }
        
        if(i>nums.length)
            return;
        
        subset.add(nums[i]);
        dfs(nums,i+1,subset);
        while(i+1<nums.length && nums[i]==nums[i+1])
            i+=1;
        subset.remove(subset.size()-1);
        dfs(nums,i+1,subset);
    }
}