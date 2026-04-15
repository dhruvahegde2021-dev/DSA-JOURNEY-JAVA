// Pattern: Stacks
// Time Complexity: O(n)
// Space Complexity: O(n)
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        for(int asteroid:asteroids)
        {
            boolean destroy=false;
            while(!st.isEmpty() && st.peek()>0 && asteroid<0)
            {
                if(Math.abs(st.peek())<Math.abs(asteroid))
               {
                     st.pop();
                    continue;
               }
               else if(Math.abs(st.peek())==Math.abs(asteroid))
               {
                    st.pop();
                    destroy=true;
                    break;
               }
               else
               {
                destroy=true;
                break;
               }
            }
            if(!destroy)
                st.push(asteroid);
        }

        int[] ans=new int[st.size()];
        for(int i=ans.length-1;i>=0;i--)
        {
            ans[i]=st.pop();
        }
        return ans;
    }
}