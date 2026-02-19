// Pattern: Stacks
// Time Complexity: O(n)
// Space Complexity: O(n)
class Solution {
    public int evalRPN(String[] tokens) {
        Deque<String> stack=new ArrayDeque<>();
        String expr="+-*/";
        for(String s:tokens)
        {   
            if(expr.contains(s))
            {
                int right=Integer.parseInt(stack.pop());
                int left=Integer.parseInt(stack.pop());
                switch(s)
                {
                    case "+": stack.push(String.valueOf(left+right));
                              break;
                    case "-": stack.push(String.valueOf(left-right));
                              break;
                    case "*": stack.push(String.valueOf(left*right));
                              break;
                    case "/": stack.push(String.valueOf(left/right));
                              break;
                }
            }
            else
            {
                stack.push(s);
            }
        }
        return Integer.parseInt(stack.pop());
    }
}