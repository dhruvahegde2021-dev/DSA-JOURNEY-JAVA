// Pattern: Arrays
// Time Complexity: O(n)
// Space Complexity: O(n)
// Notes: Using Deque(Stack) and iterator
class Solution {
    public void reverseString(char[] s) {
        Deque<Character> st=new ArrayDeque<>();
        for(int i=0;i<s.length;i++)
        {
            st.push(s[i]);
        }
        int index=0;
        for(char c:st)
        {
            s[index]=c;
            index++;
        }
        System.out.println(s);
}
}