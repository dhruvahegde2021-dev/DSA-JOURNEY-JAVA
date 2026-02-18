// Pattern: Stacks
// Time Complexity: O(n)
// Space Complexity: O(n)
class Solution {
    public boolean isValid(String s) {
        Deque<Character> deque=new ArrayDeque<>();
        for(Character c:s.toCharArray())
        {
            if(c=='(')
                deque.push(')');
            else if(c=='[')
                deque.push(']');
            else if(c=='{')
                deque.push('}');
            else
            {
                if(deque.isEmpty() || deque.pop()!=c)
                    return false;
            }
        }
        return deque.isEmpty();
}
}