class MyLinkedList {
    private class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    private Node head;
    private int size;

    public MyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public int get(int index) {
        if(index < 0 || index >= size) return -1;
        Node current = head;
        for(int i = 0; i < index; i++)
            current = current.next;
        return current.val;
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        size++;
    }
    
    public void addAtTail(int val) {
        if (head == null) { 
            addAtHead(val);
            return;
        }
        Node newNode = new Node(val);
        Node current = head;
        while(current.next != null)
            current = current.next;
        current.next = newNode;
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if (index > size) return; 
        if (index <= 0) {
            addAtHead(val);
            return;
        }
        
        Node newNode = new Node(val);
        Node current = head;
        int count = 0;
        while(current != null) {
            if(count == (index - 1)) {
                newNode.next = current.next;
                current.next = newNode;
                size++;
                return; 
            }
            count++;
            current = current.next;
        }
    }
    
    public void deleteAtIndex(int index) {
        if (head == null || index < 0 || index >= size) return;
        if (index == 0) {
            head = head.next;
            size--;
            return;
        }
        
        Node current = head;
        Node prev = null;
        int count = 0;
        while(current != null) {
            if(count == index) {
                prev.next = current.next;
                size--;
                break;
            }
            prev = current;
            current = current.next;
            count++;
        }
    }
}