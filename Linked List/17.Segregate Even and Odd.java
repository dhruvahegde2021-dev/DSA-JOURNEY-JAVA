// User function Template for Java

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
    Node divide(Node head) {
        Node temp=head;
        ArrayList<Integer> odd=new ArrayList<>();
        ArrayList<Integer> even=new ArrayList<>();        
        while(temp!=null)
        {
            if(temp.data %2!=0)
            {
                odd.add(temp.data);
                temp=temp.next;
            }
                
            else
            {
                even.add(temp.data);
                temp=temp.next;
            }
        }
        temp=head;
        int i=0,j=0;
        while(temp!=null && i<even.size())
        {
            temp.data=even.get(i);
            temp=temp.next;
            i++;
        }
         while(temp!=null && j<odd.size())
        {
            temp.data=odd.get(j);
            temp=temp.next;
            j++;
        }
        
        return head;
    }
}