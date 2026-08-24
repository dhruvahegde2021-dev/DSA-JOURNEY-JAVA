// Pattern:Heap and Priority Queue
// Time Complexity: O(nlog n)
// Space Complexity: O(n)
class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] count=new int[26];
        for(char t:tasks)
            count[t-'A']++;
        
        Arrays.sort(count);
        int maxCount=count[25]-1;
        int idleSlots=maxCount*n;
        for(int i=24;i>=0 && count[i]>0;i--)
        {
            idleSlots-=Math.min(count[i],maxCount);
        }

        if(idleSlots>0)
           return(idleSlots+=tasks.length);
        else
            return tasks.length;

    }
}