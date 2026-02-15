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
// Space Complexity: O(1)
// Notes: Deletion of multiple elements
}
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null)
            return null;
        if(head.val==val)
        {
            ListNode temp=head;
            head=head.next;
        }
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        ListNode current=head;
        while(current!=null)
        {
            if(current.val==val)
            {   
                prev.next=current.next;
            }
            else{
                prev=current;
            }

            current=current.next;
        }
        return dummy.next;
    }
}