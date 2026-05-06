/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public ListNode find(ListNode head,int k)
    {
        int count=1;
        ListNode temp=head;
        while(temp.next!=null)
        {
            if(count==k)
            {
                return temp;
            }
            count++;
            temp=temp.next;
        }
        return null;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || k==0)
            return head;
        ListNode tail=head;
        int c=1;
        while(tail.next!=null)
        {
            c++;
            tail=tail.next;
        }
        if(k%c==0)
            return head;
        k=k%c;
        tail.next=head;
        ListNode newNode=find(head,c-k);
        head=newNode.next;
        newNode.next=null;
        return head;
    }
}