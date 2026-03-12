/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    public Node reverse(Node head)
    {
        Node front=null;
        Node temp=head;
        Node prev=null;
        while(temp!=null)
        {
            front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
    public Node addOne(Node head) {
        head=reverse(head);
        Node temp=head;
        int carry=1;
        while(temp!=null && carry>0)
        {
            int sum=temp.data+carry;
            temp.data=sum%10;
            carry=sum/10;
            if(temp.next==null && carry>0)
            {
                temp.next=new Node(carry);
                carry=0;
            }
            temp=temp.next;
        }
        head=reverse(head);
        return head;
    }
}