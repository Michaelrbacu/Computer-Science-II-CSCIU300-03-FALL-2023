public class SortedLinkedList {
    // inner class; define a Node
    private class Node {
        public int info;
        public Node next;

        public Node(int data) {
            this.info = data;
            next = null;
        }
    }

    private Node head;// point to the head of the linked list

    public SortedLinkedList() // constructor
    {
        head = null; // initially, the linked list is empty
    }

    public void addnode(Node n) {
        // add your code here

        if (head == null) // if the list is empty, new node is the head
            head = n;
        else {
            Node prev = null, current = head;
            while (current != null && current.info < n.info) // find where to insert new node
            {
                prev = current;
                current = current.next;
            }
            if (prev == null) // new node is the smallest
            {
                n.next = current;
                head = n;
            } else // insert in between prev and current
            {
                prev.next = n;
                n.next = current;
            }
        }
    }
}
