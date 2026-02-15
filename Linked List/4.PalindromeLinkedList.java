/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; 
 * // Pattern: Linked List
// Time Complexity: O(n)
// Space Complexity: O(n)
// Notes: Use Deque
}
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null)
            return true;
        ListNode current=head;
        Deque<Integer> st=new ArrayDeque<>();
        while(current!=null)
        {
            st.push(current.val);
            current=current.next;
        }
        ListNode temp=head;
        while(temp!=null)
        {
            if(st.pop()==temp.val)
            {   temp=temp.next;
            }
                
            else
                return false;
        }
        return true;
    }
}