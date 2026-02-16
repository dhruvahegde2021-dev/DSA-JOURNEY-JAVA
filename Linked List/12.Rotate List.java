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
    public ListNode findNth(ListNode temp , int k)
    {
        int count=1;
        while(temp.next!=null)
        {   
            if(count==k)
                return temp;
            count++;
            temp=temp.next;
        }   
        return temp;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || k==0)
            return head;
        ListNode tail=head;
        int c=1;
        while(tail.next!=null)
        {
            tail=tail.next;
            c++;
        }
        if(k%c==0)
            return head;
        k=k%c;
        tail.next=head;
        ListNode newNode=findNth(head,c-k);
        head=newNode.next;
        newNode.next=null;
        return head;
    }
}