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
// Notes: Use dummy node and traverse both lists
}
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null && list2==null)
            return null;
        if(list2==null)
            return list1;
        if(list1==null)
            return list2;
        ListNode temp1=list1;
        ListNode temp2=list2;
        ListNode dummy=new ListNode(0);
        dummy.next=null;
        ListNode current=dummy;
        while(temp1!=null && temp2!=null)
        {
            if(temp1.val<=temp2.val)
                {
                    current.next=temp1;
                    temp1=temp1.next;
                }
            else
                {
                    current.next=temp2;
                    temp2=temp2.next;
                }
             current=current.next;
        }
        if(temp1!=null)
        {
            current.next=temp1;
            current=current.next;
            temp1=temp1.next;
        }

        if(temp2!=null)
        {
            current.next=temp2;
            current=current.next;
            temp2=temp2.next;
        }
    return dummy.next;
    }
}